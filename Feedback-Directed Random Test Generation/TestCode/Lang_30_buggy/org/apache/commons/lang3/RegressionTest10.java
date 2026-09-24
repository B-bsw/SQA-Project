package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...                           hi!hi            hihi!hi                           hi!hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi          " + "'", str1, "...                           hi!hi            hihi!hi                           hi!hi          ");
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi           ", (java.lang.CharSequence) "###############################################hi#!#hi#############################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           " + "'", charSequence2, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                         ", "4            4                           ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...                                !ih!ih!ih!ih!ih!ih!ih", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 63);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################" });
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444" + "'", str2, "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444", (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI ! HI ! HI ! HI", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray1, strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 4, 48);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str5, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                   ", "                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("          IH!IH                           IH!IHIH            IH!IH                           IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str2, "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                       a#############################################ahia!ahia                        ", "####################################################################################################", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                       a", "ahia!ahia                        " });
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444!", "                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str2, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!                 ", "                       ###############################################hi#!#hi#                        ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!                 " + "'", str3, "I!                 ");
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HHHHHHHHHHHHHHHHHHHHHHH", "hi!                               ", "                                                                                                                                                        ##############################################                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI#################################hi!hi         ", (int) (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         h", "hI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!H..." + "'", str2, "hI!HI                           hI!H...");
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                              hI!HIhI!HIh################################", "#############################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!", 874, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      HI!HI#################################hi!hi                        ", "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "      HI!HI#################################hi!hi                        " });
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "I!HI                                       hiHI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi                           hi!hi            hihi!hi                           hi!hi            " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi                           hi!hi            hihi!hi                           hi!hi            " + "'", str4, "i!hi                           hi!hi            hihi!hi                           hi!hi            ");
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                            ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!hiHi!hiH########################", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!HI#################################hi!hi         ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("   hiHI!HI                           hI!HI          ", "############ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hiHI!HI                           hI!HI          " + "'", str2, "   hiHI!HI                           hI!HI          ");
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "                          hI!HI               ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" + "'", str3, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" });
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HhI!HI                           hI!HI                           h################################HI", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI                           hI!HI                           h################################HI" + "'", str2, "HhI!HI                           hI!HI                           h################################HI");
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "44444444444444444444444444###############...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             " + "'", str2, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "4444444444444444444444444444444444444444444444hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str2, "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HhI!HI             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             " + "'", str2, "HhI!HI             ");
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("    H     hi!hi                 ", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("############...", "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############..." + "'", str2, "############...");
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str1, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str2, "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hI!                               ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "I!HI                                       hiHI!HI", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h" + "'", str2, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I!HI                           hI!HI                           h################################", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("             HI   Hi!hiHi!hiH                 ", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             HI   Hi!hiHi!hiH                 " + "'", str2, "             HI   Hi!hiHi!hiH                 ");
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("IH!IH#############################################", "Hi!hiHi!hiH################################", (int) ' ', 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IH!IH##########Hi!hiHi!hiH##################################################" + "'", str4, "IH!IH##########Hi!hiHi!hiH##################################################");
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("IH!IH###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih###################################" + "'", str1, "ih!ih###################################");
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!                                                                                                 ", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "hi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HIHI!HIH################################", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "                44hi!hi!4444hi!hi!4444hi!hi!44", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI", "HI", "HHI", "HI", "HI", "HHI", "HI", "HI", "HHI", "HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" });
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      Hhi!                                     ", "!ihhhI!                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhhI!                 " + "'", str2, "!ihhhI!                 ");
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          IH!IH                           IH!IHIH            IH!IH                           IH!IH", "4444444HIHi!hiHi!hiH#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444", "44HI444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444!ih444", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444!ih444                                                                                  " + "'", str2, "4444!ih444                                                                                  ");
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HhI!HI                           hI!HI                           h################################HI", "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI                           hI!HI                           h################################HI" + "'", str2, "HhI!HI                           hI!HI                           h################################HI");
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##!ih", "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ", 19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##!ih" });
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "hI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444..." + "'", str2, "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "hi!hi!", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", strArray3, strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#####" + "'", str14, "#####");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           " + "'", str15, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...######################", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI   Hi!hiHi!hiH    ", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("I!HI                           hI!HI                           h###############################", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI                           hI!HI                           h" + "'", str2, "!HI                           hI!HI                           h");
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  4444444444444444444444444444444444444444444444!   ", "             hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str2, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!44...", "4444!ih444                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "44hi!hi!44");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...                           hi!hi            hihi!hi                           hi!hi          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi          " + "'", str1, "...                           hi!hi            hihi!hi                           hi!hi          ");
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "                           4            4                           ", 84);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!HI!HI!H");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "444");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("HII!HI                                       hiHI!HI", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str6, "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str8, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str16, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                  " });
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", (java.lang.CharSequence) "!IHHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444!ih444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444!IH444" + "'", str1, "4444!IH444");
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                  ", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                   " });
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "", "                  ###############################################HI#!#HI#                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                               " + "'", str2, "hi!                               ");
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "################################HhI!HI            ##", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                                       hiHI!HI", "     4444444444444444444444444444444444444444444444      ", 92);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("I!HI                           HI!HI            HIHI!HI                           HI!H...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("###################################", "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444", "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "         H                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4            4                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaHI#HIaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaHI#HIaa" + "'", str1, "aaHI#HIaa");
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" hI!HI  ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4", "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         H         H         H         H        hi!         H         H         H         H      ", "444hi!4444     ", "                               !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H                    H         H         H         H      " + "'", str3, "         H         H         H         H                    H         H         H         H      ");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("I!                 ", strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hihi!hi" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hihi!hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hihi!hi" + "'", str5, "hi!hihi!hi");
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "############aaaaa###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                   4444444", "!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "hI!HI", 137, 236);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  44444444444444444444444444444hI!HI" + "'", str4, "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  44444444444444444444444444444hI!HI");
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                              I!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I!" + "'", str2, "                                                                                              I!");
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("I!HI                           HI!HI            HIHI!HI                           HI!H...", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           HI!HI            HIHI!HI                           HI!H..." + "'", str2, "I!HI                           HI!HI            HIHI!HI                           HI!H...");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("................AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "................AA" + "'", str1, "................AA");
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI!HI4444444444444444444444444444444!", "", "", "444hi!4444", "", "", "" });
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", "IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                 a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                                         a#############################################ahia", "ahia                                  " });
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!IH###################################", '#', 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "4444444", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            HI!HI!HI", 874, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi                           hi!hi       ...", " H     hi!hi                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("#####    H     ", "                                                                                              I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!   hi!hihi!hih################################hi4!  " + "'", str2, "!   hi!hihi!hih################################hi4!  ");
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", 'a', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "H!IH", "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II", 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                               ###################", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 0, 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!                               ", "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", strArray3, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 20 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                               ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                               " + "'", str7, "                               ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!                               " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!                               " + "'", str11, "hi!                               ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                               " });
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                                       hiHI!HI                                       ", "IH!IH!IH!IH", 63);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI                                       hiHI!HI                                       " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!HI                                       hiHI!HI                                       " + "'", str5, "I!HI                                       hiHI!HI                                       ");
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!HHHHHHHHHHHHHHHHHHHHHHH", "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                        ##############################################                                                                                                                                                        ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 !IH", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hiHi!hiHIhi!hiHi!hi" + "'", str1, "hi!hiHi!hiHIhi!hiHi!hi");
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi                           Hi!hi                           H################################", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi                           Hi!hi                           H################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hi                           Hi!hi                           H################################" + "'", str4, "Hi!hi                           Hi!hi                           H################################");
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                              HI#HI                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              hi#hi                                              " + "'", str1, "                                              hi#hi                                              ");
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "HI!HI                           hI!HI            ...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                               ###################", "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               ###################" + "'", str2, "                               ###################");
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaa", "                                                                                                   ", 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hiHi!hiH" + "'", str1, "Hi!hiHi!hiH");
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4            4                           ", "ih!ih#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4            4                           " + "'", str2, "4            4                           ");
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!4444     ", (int) (byte) 100, "##############444hi!4444     ##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444     ##############444hi!4444     ############################444hi!4444     ################" + "'", str3, "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI", (java.lang.CharSequence) "                                            HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#", "I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" #############################################", "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " #############################################" });
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaa", "hI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!HIHI!HI", ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HI                           hI!HI                           h################################", "................AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI                           h################################" + "'", str2, "I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI" + "'", str1, "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                            ##################################hi!hi                             ", "4444!IH444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi                           hi!hi            hihi!hi                           hi!hi", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", 47);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', (int) (short) 100, 63);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi                           hi!hi            hihi!hi                           hi!hi" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444", 61, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!4444444hi!4444444hi!4444444hi!" + "'", str3, "44hi!4444444hi!4444444hi!4444444hi!");
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 62);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444hi" });
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444", (java.lang.CharSequence) "         H                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ", "                44hi!hi!4444hi!hi!4444hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ", 67, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        " + "'", str3, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ");
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444", 100, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444hI!HI                           hI!HI                           hI!HI                        " + "'", str3, "4444444hI!HI                           hI!HI                           hI!HI                        ");
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("##############################################", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi#hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hihi#hi!hi#hihihi#hi!" + "'", str5, "hihi#hi!hi#hihihi#hi!");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HI#################################hi!hi444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hihi!hi", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hi" + "'", str3, "hi!hihi!hi");
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI" + "'", str1, "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!" + "'", str1, "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("################################4444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###", "aaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###" });
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444HI!HI!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH" + "'", str1, "IH!IH");
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                        I!444", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!   hi!hihi!hih################################hi4!  ", "#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444HI!H444", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444" + "'", str2, "444HI!H444");
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "hI!HI                           hI!HI             hi");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" + "'", str6, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444!ih444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444HI!HI!...                    ", 236, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  4444444444HI!HI!...                                                                                                                       " + "'", str3, "                                                                                                  4444444444HI!HI!...                                                                                                                       ");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              hI!HIhI!HIh################################", "                                                                                                                                                                                                                                                                                                                                                        I!444", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                                       hiHI!HI", "     4444444444444444444444444444444444444444444444      ", 92);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", strArray1, strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str6, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##########################################...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 29, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#############################################HI!HI!##########################################..." });
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!4444     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4444    " + "'", str1, "hi!4444    ");
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!HI!HI!HI!HI!                              ", "444!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("444hi!4444", "                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444" + "'", str2, "444hi!4444");
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("############ih!ih###################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444!ih444", 'a', 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" #############################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "HI!HI!", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str3, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          IH!IH                           IH!IHIH            IH!IH                           IH!IH", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ihhh", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################hi!hi!#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################hi!hi!#############################################" + "'", str1, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                 HI!HIhI!HIhiHI!HIhI!HIHI!", 35, "                               !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 HI!HIhI!HIhiHI!HIhI!HIHI!" + "'", str3, "                 HI!HIhI!HIhiHI!HIhI!HIHI!");
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##########", "                                              hI!HIhI!HIh################################", "            hiHI!HI                           ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IH!IH#############################################", "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              hI!HIhI!HIh################################", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "44444444444444444444444444444444444444444444444444444444", 1, 89);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                              hI!HIhI!HIh################################" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hih################################    ", "            hiHI!HI                           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "################################", "", "", "", "" });
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("H", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str8, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                   4444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################.." + "'", str1, "################################..");
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444", 99, "            hiHI!HI                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            hiHI!HI                                       hiHI!HI               4444444444444444444" + "'", str3, "            hiHI!HI                                       hiHI!HI               4444444444444444444");
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hihi!hi", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                HI!HI!HI!AA");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str1, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!                                             ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#####!#####", "################################HhI!HI            ##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!hi!hi!aa", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hi!hi!aa" + "'", str2, "HI!hi!hi!aa");
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI" + "'", str1, "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       #############################################HI!HI                        ", 'a', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!HI                            ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                            " + "'", str2, "I!HI                            ");
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "IH!IH##################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI!HIhI!HIh################################");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "I", "!", "HI", "h", "I", "!", "HI", "h", "################################" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################################HI#!#HI#", 96, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH!IH#############################################", "4444444444444444444444444444444444444444444444HI!HI", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", 5, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IH!IH#############################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IH!IH#############################################" + "'", str4, "IH!IH#############################################");
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("IH!IH###################################", "HI   Hi!hiHi!hiH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h################################ hI!HI HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H################################ Hi!hi hi!hi" + "'", str1, "H################################ Hi!hi hi!hi");
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', (int) 'a', 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray2, strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hI!HI                           hI!HI                           h################################");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "H" + "'", str11, "H");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!" + "'", str13, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                     hi!hi", "IH!IH", 103);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                     hi", "hi" });
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...                   4444444444444444444444444444444444444444444444HI!HI!...                    " + "'", charSequence2, "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("I!                 ", "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                 " + "'", str2, "I!                 ");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HIHI!HIH################################" + "'", str1, "hI!HIHI!HIH################################");
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("I!HI!HI!HI!HI!H", "4", 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!H" + "'", str3, "I!HI!HI!HI!HI!H");
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI                           hI!HI                           h################################", 236, "hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################" + "'", str3, "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaHI#HIaaa", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", 48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aa", "aaa" });
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                    HI#HI                    ", "                                                                                                                                                                                                                                                                                                                                                              ", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                           HI!HI                           H###############################", "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I!HI                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                            " + "'", str1, "I!HI                            ");
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "H################################ Hi!hi hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h################################ Hi!hi hi!hi" + "'", str1, "h################################ Hi!hi hi!hi");
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44hi!hi!44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", 34, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" + "'", str4, "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#####!#####", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                             I!HIhI!HIh################################                                                                                                              ", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                             I!HIhI!HIh################################                                                                                                              " + "'", str2, "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "      Hhi!                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 873 + "'", int1 == 873);
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IH!IH                           IH!IHIH            IH!IH                           IH!IH", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str2, "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hihi#hi!hi#hihihi#hi!", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi#hi!hi#hihihi#hi!" + "'", str2, "hihi#hi!hi#hihihi#hi!");
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "Hi!aa", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("####################################", "I!444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################" + "'", str3, "####################################");
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " " + "'", str8, " ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       ih!iH                           ih!ih", "I!    ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H         H         H         H        HI!         H         H         H         H         ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                            444!   ", 43, 161);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 444!   " + "'", str3, "                 444!   ");
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444444444444444444444444444444!   444hi!4444   ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                   ", "!hi!hi                           Hi!hi            HIhi!hi              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "HI", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "4444444HIHi!hiHi!hiH#########", "I!HI  ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................" + "'", str3, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih" + "'", str2, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray3, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "4444444444444444444444444444444!   444hi!4444   ", 15, 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str7, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                               !ih", "                 HI!HIhI!HIhiHI!HIhI!HIHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###################################", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################HI!HI!##########################################...", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...!IH!IH4444444444444444444444444444444444444444444444                   ...", "...                           hi!hi            hihi!hi                           hi!hi           ", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...!IH!IH4444444444444444444444444444444444444444444444                   ..." });
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!                                ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ihhh", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhh" + "'", str2, "!ihhh");
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ", 88, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           " + "'", str3, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                  ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                  " });
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#I!HI#I!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#I!HI#I!HI" + "'", str1, "#I!HI#I!HI");
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi                           hi!hi                           h################################", 162);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi                           h################################" + "'", str2, "hi!hi                           hi!hi                           h################################");
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaHI#HIaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                            HI!HI!HI", "i!444", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                   4444444                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hiHI!HI                           hI!HI           ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiHI!HI", "hI!HI" });
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI   Hi!hiHi!hiH    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   Hi!hiHi!hiH    " + "'", str2, "HI   Hi!hiHi!hiH    ");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("     4444444444444444444444444444444444444444444444 hI!HI                           ", "!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444!ih444                                                                                  ", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#", "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                           HI!HI                           H################################", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI                           hI!HI            hiHI!HI                           hI!HI", "4444444444444444444444444444444444444444444444", 874);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI                           hI!HI            hiHI!HI                           hI!HI" });
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#####    H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                     hi!hi", "##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     hi!hi" + "'", str2, "                     hi!hi");
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "HI#HI", "hihi#hi!hi#hihihi#hi!", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Hi!hiHi!hiH################################", (java.lang.CharSequence) "4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hi!hiHi!hiH################################" + "'", charSequence2, "Hi!hiHi!hiH################################");
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "###########################################", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           " + "'", str3, "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!444", "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h################################ hi#hi hi#hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI   Hi!hiHi!hiH################################", "hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "", "", "H", "", "", "", "H", "", "", "", "H################################" });
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", 874, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                    ...", "###############################################hi#!#hi", "                                      H    ", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                    ..." + "'", str4, "                                                    ...");
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", 68, "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           " + "'", str3, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str1, "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", "...#I!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI          " + "'", str2, "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "                     hi!hi", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI!HI4444444444444444444444444444444!   444hi!4444   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###################", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   HI!HIHI!HIH################################    " + "'", str2, "HI   HI!HIHI!HIH################################    ");
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444HI!H444", 161, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaa", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ihih!ih" + "'", str1, "ih!ihih!ih");
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str1, "#####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", "                  ###############################################HI#!#HI#                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##### ######hi!hi", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##### ######hi!hi" + "'", str2, "##### ######hi!hi");
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("            hiHI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            HIhi!hi                           " + "'", str1, "            HIhi!hi                           ");
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ", "Hi!aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        " + "'", str2, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ");
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H         ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         H         H         H         H        HI!         H         H         H         H         " });
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("############aaaaa###################################", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############aaaaa###################################" + "'", str2, "############aaaaa###################################");
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", 874, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!                                                                                                 ", "##########", "    h     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################" + "'", str1, "################################");
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("####################################################################################################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray2, strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray10, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray5, strArray10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "                               ###################", 0, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str6, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#####" + "'", str13, "#####");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str16, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("I!                              ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                              " + "'", str2, "I!                              ");
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!h", (java.lang.CharSequence) "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", 350, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", "hi!hhhhhhhhhhhhhhhhhhhhhhh");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#I!HI", 'a', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", 460);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI" });
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "IH!IH#############################################", (java.lang.CharSequence) "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "IH!IH#############################################" + "'", charSequence2, "IH!IH#############################################");
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", '#', 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhh" + "'", str1, "!ihhh");
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                    HI#HI                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI" + "'", str2, "HI#HI");
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("################################..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...###################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444!   444hi!4444   ", "                                              HI#HI                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi                           Hi!hi            HIhi!hi                           Hi!h", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!h" + "'", str2, "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!IH#############################################" + "'", str1, "iH!IH#############################################");
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###############################################", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!IhI!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!IhI!aaaaaaaaaaaaaaaaa" + "'", str1, "hi!IhI!aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI   Hi!hiHi!hiH    ", "                                      444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str3, "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     4444444444444444444444444444444444444444444444      ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                           HI!HI                           H################################", "hi!hiHi!hiHIhi!hiHi!hi", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           HI!HI                           H################################" });
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("            IH!Ih                           IH!IHih            IH!Ih                           IH", "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            IH!Ih                           IH!IHih            IH!Ih                           IH" + "'", str2, "            IH!Ih                           IH!IHih            IH!Ih                           IH");
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!                              ", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                        ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                hi                 ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                   ", "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44HI444", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44HI444" });
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI                            ", ' ', 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!hiHi!hiH########################", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiH########################" + "'", str2, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####    H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####    H" + "'", str1, "#####    H");
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ", 57, 33);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI   Hi!hiHi!hiH################################    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    #HI   Hi!hiHi!hiH" + "'", str2, "    #HI   Hi!hiHi!hiH");
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hihi!hihihi!hihi!hi", "IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hihihi!hihi!hi" + "'", str2, "hi!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i!" + "'", str1, "!i!i!i!");
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih##################################", "hi!aa", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "############", "", "", "", "", "##################################" });
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Hi!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!    ", (int) (short) 0, "ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!    " + "'", str3, "I!    ");
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi#hi", (java.lang.CharSequence) "444   4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IHHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhi" + "'", str1, "!ihhi");
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi! ", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "!44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "HIHi!hiHi!hi#Hi!hiHi!hiHI", "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!!i                           ii!!i            ii!i!!i                           ii!!i" + "'", str3, "!i!!i                           ii!!i            ii!i!!i                           ii!!i");
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HhI!HI            ", 874, 260);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HhI!HI            " + "'", str3, "HhI!HI            ");
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", "HI!HI                           HI!HI            ...", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str3, "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                hi                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi###########################hi!hi############hihi!hi###########################hi!hi############" + "'", str3, "Hi!hi###########################hi!hi############hihi!hi###########################hi!hi############");
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!4444     ##############444hi!4444     ############################444hi!4444     ################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!                               ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!                              ", 78, 56);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HII!HI                                       hiHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HII!HI                                       hiHI!HI" + "'", str1, "HII!HI                                       hiHI!HI");
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("           hI!HI   ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hI!HI   " + "'", str2, "                        hI!HI   ");
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", "...###################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################HI!HI!#############################################", "##########################################################################################################################################################################", 63);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 1, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI!HI!#############################################" });
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!i!!i                           ii!!i            ii!i!!i                           ii!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!", "hi", "hi        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                 !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 !ih" + "'", str1, "                                                                                                 !ih");
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444" + "'", str2, "444444444444444444444444");
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" hI!HI  ", "                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                           hI!HI                           h################################", "                           HI!HI                           H################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           " + "'", str1, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                    ", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444" + "'", str1, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("############ih!ih###################################", "                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI#################################hi!hi         ", "HHHHHI!HHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!HI!HI!HI!HI!", "HI!HI#################################hi!hi         ", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           HI!HI            ...", "################################...", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hihi#hi!hi#hihihi#hi!", 78, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444" + "'", str3, "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!HI                           hI!HI                           h################################", (java.lang.CharSequence) "            hiHI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("################################4444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################", "##########################################################################################################################################################################", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################hi!hi", strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ih!ih", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 37 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444###############...", "Hi!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI   Hi!hiHi!hiH    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4", "Hi!aa", 460);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4" });
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                        ", "hI!HI                           HI!HI            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             hI!HI             hi", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "             hI!HI             hi" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             hI!HI             hi" + "'", str3, "             hI!HI             hi");
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!                 ", "                       ###############################################hi#!#hi#                        ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!                 " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!hi!hi                           Hi!hi            HIhi!hi              ", 35, "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi              " + "'", str3, "!hi!hi                           Hi!hi            HIhi!hi              ");
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaa", "aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         aaaaaaa     " + "'", str2, "                         aaaaaaa     ");
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Ih!iHi!444Ih!iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HHI!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHI!                               " + "'", str1, "HHI!                               ");
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI#################################hi!hi         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HHI!                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HHI!" });
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("         H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H" });
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaa" });
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HIHI!HIH################################", "                         aaaaaaa     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HIHI!HIH################################" });
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ihhi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ihhi" });
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" + "'", str1, "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         H         H         H        hi!         H         H         H         H" + "'", str1, "H         H         H         H        hi!         H         H         H         H");
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("I!HI                                       hiHI!HI", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444", "HI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI   Hi!hiHi!hiH################################", "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...#####################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI   Hi!hiHi!hiH################################" + "'", str3, "HI   Hi!hiHi!hiH################################");
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!                                            hI!HIhi!                                             ", ' ', 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "IH!IH###################################", "                           HI!HI                           H################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "IH!IH###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HI", "HI!HIHI!HIH################################", 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HIHI!HIH################################HI" + "'", str3, "HI!HI!HIHI!HIH################################HI");
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                            HI!HI!HI", "!i!i                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray6, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ', (int) (short) 100, (int) (short) 100);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "HI!HI!HI!AA", 99, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                          !IHHI            " + "'", str10, "                          !IHHI            ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH", "!ihhhI!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "             hI!HI             hi", charArray6);
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
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                             I!HIhI!HIh################################                                                                                                              ", "hi! ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("####################################", "    #HI   Hi!hiHi!hiH", "############aaaaa###################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################" + "'", str3, "####################################");
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("####################################################################################################", "                                            HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#####    H     ", "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!##", "#############################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!##" + "'", str2, "hi!##");
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!HHI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                HI!HI!HI!AA", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                          HI!HI!HI!AA" + "'", str2, "                                                                                                                                                                                                                                                                          HI!HI!HI!AA");
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  hiHI!HI                           hI!HI          ", 92, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HhI!HI            ", "4444444444444444444444444444444444444444444444hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!HI                           hI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("    H  ", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H  " + "'", str2, "    H  ");
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###########################################", "", 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 47, 237);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###########################################" });
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HIHi!hiHi!hi#Hi!hiHi!hiH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI", "!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", 85, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####..." + "'", str3, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", ' ', 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            hiHI!HI                                       hiHI!HI               4444444444444444444", "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
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
        boolean boolean52 = org.apache.commons.lang3.StringUtils.startsWithAny("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", strArray40);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                              ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("ih!ih###################################", "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI" + "'", str2, "HI!HI");
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                    HI#HI                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", "hi! HI!HI                           hI!HI            hiHI!HI       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI" + "'", str2, "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###############################################hi#!#hi#", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi#                                 " + "'", str2, "###############################################hi#!#hi#                                 ");
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("################################HhI!HI            ", "444   4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHH", (java.lang.CharSequence) "i!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HHHHHHHHHHHHHHHHHHHHHHH" + "'", charSequence2, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "####################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...                           hi!hi            hihi!hi                           hi!hi          ", 'a', 161);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           " + "'", str1, "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444!IH444", "#############################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444!IH444" });
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!  !   hi!hihi!hih################################hi" + "'", str2, "!  !   hi!hihi!hih################################hi");
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("   !4444444444444444444444444444444", "################################...", 874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi                           hi!hi       ...", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", (int) (byte) 100);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi                           hi!hi       ..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str6, "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "aaaaaaaaaaaaaaaaaaaaaaaaaa", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("####################################################################################################", "HI!                               ", "                       #############################################hi!hi                        ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################################################################" + "'", str4, "####################################################################################################");
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" });
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI#################################hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HI" + "'", str1, "HI!HIHI!HI");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
        char[] charArray6 = new char[] { 'a', '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444hi!4444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444" + "'", str2, "444hi!4444");
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hih!ihih!ih############################### hi#hi hi#hi", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hih!ihih!ih############################### hi#hi hi#hi" + "'", str2, "hih!ihih!ih############################### hi#hi hi#hi");
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH!IH                           IH!IHIH            IH!IH                           IH!IH", "           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", "                                                                                                 !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################################...", 24, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################..." + "'", str3, "################################...");
    }
}

