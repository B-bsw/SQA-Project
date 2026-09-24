package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H" + "'", str2, "IhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H");
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##################################hi!hi", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################hi!hi" + "'", str3, "##################################hi!hi");
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                    ", "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                          hI!HI               ", "##############     4444!ih444##############", 159, 874);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                          hI!HI               ##############     4444!ih444##############" + "'", str4, "                          hI!HI               ##############     4444!ih444##############");
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...", "  4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("         H         H         H         H                    H         H         H         H      ", "aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                        ", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################", "                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444HI!H444", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 444HI!H444  " + "'", str2, " 444HI!H444  ");
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################" + "'", str2, "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#################################hi!                               #################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                               " + "'", str2, "hi!                               ");
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444", "                                            HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("IAHI                           hIAHI            hAHIAHI                           hIAHI", "...4444444444444444 hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IAHI                           hIAHI            hAHIAHI                           hIAHI" + "'", str2, "IAHI                           hIAHI            hAHIAHI                           hIAHI");
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "  4444444444444444444", 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444", "hi", "!", "4444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                      444444444", "hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", "             hI!HI             hi", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!HIHI!HIH##############...", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "I!                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("##############444hi!4444     ###############", "hi!hi                           hi!hi            hihi!hi                           hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!", "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", 11);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!" + "'", str5, "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hihi!hihihi!hihi!hi", "44444444444   HIhi!hi                           Hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "HI!HI#################################hi!hi         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                         aaaaaaa     ", "#############################################HI!HI!#############################################", "    H  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI" + "'", str3, "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444h44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444h44444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444h44444444444444444444444444444444444444444444");
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "H         H         H         H        hi!         H         H         H         H");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "                              " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                              " + "'", str4, "hi!                              ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!H         H         H         H        hi!         H         H         H         HH         H         H         H        hi!         H         H         H         H                              " + "'", str6, "hi!H         H         H         H        hi!         H         H         H         HH         H         H         H        hi!         H         H         H         H                              ");
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                   I!                        ", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!HI", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!                              ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaa", 277, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44hi!hi!4444hi!hi!4444hi!hi!44", "                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44" + "'", str2, "44hi!hi!4444hi!hi!4444hi!hi!44");
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!H...", "hI!                               ", 71);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "                 444!   ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444!   ", "#####    H");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", strArray6, strArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi        ", strArray11);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ihih ihih hi!hihi!hih", strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str8, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "444!   " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444!   " + "'", str13, "444!   ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str14, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444..." + "'", str2, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 0, 103);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("H################################ h                                                                           ###################", "44444444444444444444444444444444444", "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         H                      ", "444   4444", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         H                      " });
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HIhI!HIhiHI!HIhI!HI", "444444444444444444444444444444444444444h44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", "                                      H    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", "44hi!hi!4444hi!hi!4444hi!hi!44", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I", "I", "II", "I", "II", "I", "II", "I", "II", "I", "II", "I", "IIhI!I!H!H" });
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", "444HI!H444      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   Hi!hiHi!hiH################################      hiHI!HI          " + "'", str2, "HI   Hi!hiHi!hiH################################      hiHI!HI          ");
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hhi!hihi!hih################################    ", "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hihi!hih################################    " + "'", str2, "Hhi!hihi!hih################################    ");
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("################################HhI!HI            ##", "         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H" + "'", str2, "         H");
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("!i!i                                                                                                                                                                                                                                        ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi        ", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    Hi                                             " + "'", str2, "                                    Hi                                             ");
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("   hiHI!HI                           hI!HI          ", "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444", 37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str4, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444H   aaaaaaaaaaaaa", "                           HI!HI                           H###############################", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                             I!                                             ", "!I!I", "4444444                   4444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                       A#############################################AHIA!AHIA                        ", "IH!IH###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############" + "'", str2, "i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############");
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                          hI!HI               ", strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!I!I", 55, 55);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  " + "'", str2, "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("            ######################", "hhi!", "                                    ih ih ih ih ih ih ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("################################4444444444444444444444444444444444444444444444444444444444444444444", "                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("IhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h" + "'", str1, "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h");
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H################################ hi#hi hi#hi", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaa", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa", "#############################", 6, 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIaHIa#############################444444444...HIa" + "'", str4, "HIaHIa#############################444444444...HIa");
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", 85, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44hi!hi!4444hi!hi!4444hi!hi!44", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "############444HI!4444     ###############", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HI!HI!", (int) '#', (int) (byte) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, " hI!HI  aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I", "!", "    " });
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "#############################################hi!hi!#############################################", 324);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("HI   HI!HIHI!HIH################################    ", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaa                         aaaaaaa", "                                                            444!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAA                         AAAAAAA     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("############aaaaa###################################", "################################HhI!HI            ##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "############aaaaa###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!i!i!i!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################..." + "'", str1, "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...");
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI   Hi!hiHi!hiH    ", 34, "           Hi!hi   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI   Hi!hiHi!hiH               Hi!" + "'", str3, "hI   Hi!hiHi!hiH               Hi!");
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                 I!                                                                                                 ", 39, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             " + "'", str3, "             ");
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", "", 998);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 393 + "'", int3 == 393);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#############################################hi!hi!#############################################", "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi!#############################################" + "'", str2, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H", "... ...                                !ih!ih!ih!ih!ih!ih!ih", 874);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H" });
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("             #############################             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI   Hi!hiHi!hiH    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                      444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      444444444" + "'", str2, "                                      444444444");
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                         ", "HI   Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                 I!                                                                                                 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 I!                                                                                                 " });
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "     ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI!HI                           hI!HI             hi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "44444444444444444444444444###############...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HhI!HI             ", "hi!  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IHI!HI!II!                IIHI!H", "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("     4444444444444444444444444444444444444444444444", "HI!HI4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444" + "'", str2, "     4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   " + "'", str1, "                                                                                                   ");
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("################################hi!                               ############", 0, "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################hi!                               ############" + "'", str3, "################################hi!                               ############");
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 62, 16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!    ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih" + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44!IH!IH4444!IH!IH4444!IH!IH44                ", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44!IH!IH4444!IH!IH4444!IH!IH44                " + "'", str3, "44!IH!IH4444!IH!IH4444!IH!IH44                ");
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                  ", "###########HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HHHHHHHHHHHHHHHHHHHHHHH", '4', 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str1, "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("iH!IH#############################################", "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...######################", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                           ###################", "##############444hi!4444###############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           IH!Ih                           IH!IHih            IH!Ih                           IH!IH" + "'", str1, "           IH!Ih                           IH!IHih            IH!Ih                           IH!IH");
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Ih!ih#############################################", "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!ih#############################################" + "'", str3, "Ih!ih#############################################");
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HI                           hI!HI                           h###############################", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                           hI!HI                           h###############################" + "'", str3, "I!HI                           hI!HI                           h###############################");
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', (int) (short) 100, (int) 'a');
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!##" + "'", str24, "hi!##");
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi                           hi!hi            ..", "               hiHI!HI               4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!Haaaaaaa", "aaaaaaa", "HI!H" });
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!Haaaaaaa                         aaaaaaa     HI!H", "hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         H         H         H         H        4444444444444444444444444444444!   444hi!4444     H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ", 48, "                     I  I                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        4444444444444444444444444444444!   444hi!4444     H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         " + "'", str3, "         H         H         H         H        4444444444444444444444444444444!   444hi!4444     H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!HIhI!HIh");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!HIhI!HIh" });
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hiHI!HI", "##!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444hi!4444444444444444444444444", "#####hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH#####!#####IH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                ", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                " + "'", str2, "                                                                                                ");
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444", "hI!HIhI!HIh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                     hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "h", "", 51);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "##############444hi!4444###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############444hi!4444###############" + "'", str1, "##############444hi!4444###############");
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH", 874);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("##############444hi!4444###############", "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaa", "                  ########                  ########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaa" });
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray1, strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str5, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    ", "############################hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hihihi!hihi!hi" + "'", str1, "hi!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "    H     hi!hi                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 50, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44hi!hi!44", "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("################################hi!                               ############", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ", 873);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "################################hi!                               ############" });
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!ihhh", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh" + "'", str2, "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh");
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#########", 21, 296);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             !ihIH!Ih                                            !ih", "...                        hI!H...", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "                                       !ihIH!Ih                                            !ih" });
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                        ih!ih#############################################                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        IH!IH#############################################                       " + "'", str1, "                        IH!IH#############################################                       ");
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI", "4444444444444444444444444444444444444444444444!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                              I", 41, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("......!IH!IH!IH!IH!IH!IH!IH", 387, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "......!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi                           hi!hi            hihi!hi                           hi!hi            ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444     ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                   ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...######################", '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          IH!Ih                           IH!IHih   " + "'", str1, "          IH!Ih                           IH!IHih   ");
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                " });
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("h", "ihih ihih hi!hihi!hih", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaha...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  4444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  IH!Ih4444444444444444444444444444444444444444444444  " + "'", str1, "  IH!Ih4444444444444444444444444444444444444444444444  ");
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("            hiHI!HI                          ", "                                                                                         ", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            hiHI!HI                          " + "'", str3, "            hiHI!HI                          ");
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  hiHI!HI                           hI!HI          ", "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh" + "'", str1, "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh");
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!i!i", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i" + "'", str2, "!i!i");
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h################################ Hi!hi hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       ###############################################hi#!#hi#                        ", "I!HI                           hI!HI                           h################################", 57);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "    H                                      ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray9, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 57 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hI!HI" + "'", str13, "hI!HI");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "HI!HI!HI!HI" });
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444444444444444444 hI!HI", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IAHI                           hIAHI            hAHIAHI                           hIAHI", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IAHI                           hIAHI            hAHIAHI                           hIAHI" + "'", str2, "IAHI                           hIAHI            hAHIAHI                           hIAHI");
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        hI!HI   ", "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                        hI!HI   " });
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("####################################################", '4');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444!", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##############################################################################################hi!hi!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "####################################################" + "'", str7, "####################################################");
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####", "444!  4444444444444444444444444444444444444444444444!   HI!HIHI!HIH################################HI", 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence6, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hi", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##!ih", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                      444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################" + "'", str1, "#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################");
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4", "4444!ih444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih" + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih");
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", (java.lang.CharSequence) "!HIhI!HIh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA", 53, "#################################hi!                               #################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##" + "'", str3, "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "############4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hiaaaaaaaaaaaaaaaa" + "'", str2, "                                 hiaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaahi!hihi!hihihi!h", 8, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaahi!hihi!hihihi!h" + "'", str3, "aaaaaaaaaahi!hihi!hihihi!h");
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI                           hI!HI            hiHI!HI     ...", "                     I  I                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HIHI!HI", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHI!HI" + "'", str2, "HIHI!HI");
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("############...", "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############..." + "'", str2, "############...");
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       ################################        ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ################################        " + "'", str2, "       ################################        ");
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "hi!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                       a#############################################ahia!ahia                        ", "                                    ih ih ih ih ih ih ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a#############################################ahia!ahia                        " + "'", str2, "                       a#############################################ahia!ahia                        ");
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!HI                           HI!HI            HIHI!HI                           HI!HI", "ih!ih##################################", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hihi!hihihi!hihi!hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi! ", "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                           ###################", "    !I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!HI!HI!HI!HI!", "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################", "hI#HHI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444", "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444" + "'", str2, "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h", "HI!HI#################################hi!hi         ", 159);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "##############444hi!4444     ###############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih", "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  " + "'", str2, "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray11 = new char[] {};
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence8, charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI!#############################################", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           HI!HI            ...", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!    ", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray11);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI#################################HI!HI444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI   Hi!hiHi!hiH               Hi!", 67, "!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!" + "'", str3, "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!");
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     ", "!HIHI!HIH##############...", "444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI                           HI!HI            ..", "                                                                                         ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI", "HI!HI", ".." });
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44HI444", 24, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################44HI444" + "'", str3, "#################44HI444");
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih44444444444444444444444444444444" + "'", str1, "hi!hihi!hih44444444444444444444444444444444");
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", "                       #############################################hi!hi                        ", "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI" + "'", str3, "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI");
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               !ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                               ", "!", "ih" });
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!HI            #" });
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("H################################ h                                                                           ###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H################################ h                                                                           ###################" + "'", str1, "H################################ h                                                                           ###################");
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("####", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("            hiHI!HI                                       hiHI!HI               4444444444444444444", "HHI!                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            hiHI!HI                                       hiHI!HI               4444444444444444444" + "'", str2, "            hiHI!HI                                       hiHI!HI               4444444444444444444");
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...                                ", "aaaaha...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                " + "'", str2, "...                                ");
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...!IH!IH4444444444444444444444444444444444444444444444                   ...", "         H         H         H         H                    H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!IH!IH4444444444444444444444444444444444444444444444                   ..." + "'", str2, "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H44H4h44H4hiH44H4h44H4H44H", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44H4H44H" + "'", str2, "44H4H44H");
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444", "I!HI                                       hiHI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444" });
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444", 100, "i!hihi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hihi!hii!hihi!hii!hihi!hii4444444444444444444444444444444444444444444i!hihi!hii!hihi!hii!hihi!hii!" + "'", str3, "i!hihi!hii!hihi!hii!hihi!hii4444444444444444444444444444444444444444444i!hihi!hii!hihi!hii!hihi!hii!");
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", "hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", 90);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "i" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i", "i" });
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                             I!                                             ", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H################################ Hi!hi hi!hi", "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H################################ Hi!hi hi!hi" + "'", str2, "H################################ Hi!hi hi!hi");
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44hi!hi!44", "H!IH", 25);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44hi!hi!44" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44hi!hi!44" + "'", str5, "44hi!hi!44");
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("# hI!HI hiHI!HI hI!HI I!HI", "!I                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("I!HI                                       hiHI!HI", "HI", "HI!HI!HI!AA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                               ......!ih!ih!ih!ih!ih!ih!ih", "H         H         H         H        hi!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI   Hi!hiHi!hiH    ", "!HIHI!HIH##############...", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444...", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###############################################HI#!#HI#", "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "h################################ Hi!hi hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str2, "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                             ...######                   I!                        ...######", "           hI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", "!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h", 260);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                      444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!HIhI!HIh", "HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("################################HhI!HI            ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################hhi!hi            ##" + "'", str1, "################################hhi!hi            ##");
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str1, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI#################################HI!HI444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi" + "'", str2, "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!I                                                                                              ", "H################################ hi#hi hi#hi", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###########################################", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################        " + "'", str2, "###########################################        ");
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                             ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                             ##" + "'", str1, "                                                                                                                                                             ##");
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!  !   hi!hihi!hih################################hi", " H     hi!hi                 ", "HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHHIHHH!HI!H!HI!H!################################!H" + "'", str3, "IHHIHHH!HI!H!HI!H!################################!H");
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HII!HI                                       hiHI!HII!HI                           hI!HI        ", "                   I!                        ", 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HII!HI                                       hiHI!HII!HI                           hI!HI        " + "'", str3, "HII!HI                                       hiHI!HII!HI                           hI!HI        ");
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi                           Hi!hi            HIhi!hi                           Hi!h", "!hihi!hi", "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!h" + "'", str4, "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih", " H     hi!hi                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa" + "'", str3, "aaaaaaaaaa");
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           HI!HI            ..", 261, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI            ..##################################################################################################################################################################################################################" + "'", str3, "HI!HI                           HI!HI            ..##################################################################################################################################################################################################################");
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "#####    H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str2, "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H################################ hi#hi hi#hi", "                   4444444                                                                          ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 81, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 81 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H################################", "hi#hi", "hi#hi" });
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray7, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI#################################hi!hi         ", strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!HI" + "'", str8, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                          !IHHI            " + "'", str11, "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa", "HI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hhi!", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI", "                                    ih ih ih ih ih ih ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI" + "'", str2, "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI");
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 393);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44hi!hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!44" + "'", str1, "44hi!hi!44");
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hihi!hih################################    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hiHI!HI                           hI!HI", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiHI!HI                           hI!HI             " + "'", str2, "hiHI!HI                           hI!HI             ");
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaa                         aaaaaaa     ", 261, "hi!4444    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   " + "'", str3, "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ");
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HIaHIa#############################444444444...HIa", (java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I!                                                                                                 ", "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ", 93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!hihi!hihihi!hihi!hi", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hihihi!hihi!hi" + "'", str2, "i!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                        ", "############aaaaa###################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################" + "'", str3, "#############################");
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ihh", "         H", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH444" + "'", str2, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH444");
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!HI                           hI!HI                           h################################", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str2, "hI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi                           hi!hi            hihi!hi                           hi!hi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH!IH!IH!IH", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH!IH!IH" + "'", str3, "IH!IH!IH!IH");
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaa!ih!ih", "                                                                                                                                                                                            #####hi!hi                                                                                                                                                                                             ", "4444!ih444                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa!ih!ih" + "'", str3, "aaa!ih!ih");
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                       4#############################################4hi4!4hi4                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str1, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444", "...##########################################################################################...", 69);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444" + "'", str3, "44444444444444444444");
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!IhI!aaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            hiHI!HI                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            HIHI!HI                          " + "'", str1, "            HIHI!HI                          ");
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("444!", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!" + "'", str2, "444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!");
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         h         h         h         h        hi!         h         h         h         h         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi                           hi!hi            ..", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                        ", "IH!IH###################################", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("IHHIHHH!HI!H!HI!H!################################!H", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHHIHHH!HI!H!HI!H!################################!H" + "'", str2, "IHHIHHH!HI!H!HI!H!################################!H");
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                       #############################################HI!HI                        ", "                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################4444444444444444444444444444444444444444444444444444444444444444444", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 47, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 47 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################4444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        hI!HI            ", "4", 18);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                        hI!HI            " });
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HI!HI                           HI!HI                           H################################", "hI!HI", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HIaHIa#############################444444444...HIa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIaHIa#############################444444444...HIa" + "'", str1, "HIaHIa#############################444444444...HIa");
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                     ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Ih!iH                           ih!ihIH            ih!iH                        ...", "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!4444     ", "hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4444     " + "'", str2, "hi!4444     ");
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!hi!hi                           Hi!hi            HIhi!hi              ", 237, 324);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI                           H", "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "                           ", "", "", "", "", "                           ", "" });
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                              HI#HI                                              ", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              HI#HI                                              " + "'", str2, "                                              HI#HI                                              ");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaa", "    h     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!HI                           hI!HI                           h################################", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############" + "'", str2, "#############");
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                     hi!hi", "aaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI   Hi!hiHi!hiH################################", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                     HI   Hi!hiHi!hiH################################" + "'", str2, "                                                                                                                                                                                                                                     HI   Hi!hiHi!hiH################################");
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####", "aaaaaaa", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####" });
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH", "...hi!444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                        ih!ih#############################################                       ", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ih!ih#############################################                       " + "'", str2, "                        ih!ih#############################################                       ");
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444hi!hi!", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444..." + "'", str2, "444444444444444444444444444444444444...");
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi        ", "             hi   h    h    h                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             hi   h    h    h                 " + "'", str2, "             hi   h    h    h                 ");
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         H         H         H         H                    H         H         H         H      ", "###########################################        ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                HI!HI!HI!AA", "             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi");
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                         ", "################################hi!                               ############", 6);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                         " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                         " + "'", str4, "                                                                                         ");
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hhi!", "#####    H", 232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!4444     ", "                   4444444", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###", "################HI!HI################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "###############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                                 ", "h################################ hI!HI HI!HI", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "I!                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!                                                                                                 " + "'", str5, "I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          IH!Ih                           IH!IHih   ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#####", "#######################################4444444444444444444444444444444444444444444444!HI!HIHI!HI", 349);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#####" });
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("I!HI                                       hiHI!HI", "!IHHI", 260);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                       hi" });
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hihi!hih44444444444444444444444444444444", 51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("            #############################   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ", "hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ");
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################", "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("!ih!ih", "HI!HI!", 32);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "HI!HIHI!HIH44444444444444444444444444444444", 96, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 46 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "ih", "ih" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "ih", "ih" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  44444444444444444444444444444hI!HI", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "hi!hiHi!hiHIhi!hiHi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("     4444444444444444444444444444444444444444444444 hI!HI                           ", "                                                                                                                                                                                                                                                             !hihi!hi", 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str3, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                  ", "                444!       H      H      H      H   ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ih!ih##################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih" + "'", str2, "ih!ih");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              ", "                HI!HI!HI!AA", 137);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 460, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    H     ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444     ", 'a', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...             hI!HI            hiHI!HI    ...", "!hihi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...             hI!HI            hiHI!HI    ..." });
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h" + "'", str1, "!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h");
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaah");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hI!HI                           hI!HI                           h################################", 47);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "HI!HI!HI!AA", 67, 44);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaa!ih!ih", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaah" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaa!ih!ih" + "'", str11, "aaa!ih!ih");
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HI" + "'", str1, "HIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####    H", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####    H" + "'", str3, "#####    H");
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!IH                           IH!IHIH            IH!IH                           IH!IH", '4', 387);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     ", "ih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", "HI   Hi!hiHi!hiH    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!", "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                44HI!HI!4444HI!HI!4444HI!HI!44", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI                           HI!HI            ..##################################################################################################################################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI            ..##################################################################################################################################################################################################################" + "'", str2, "HI!HI                           HI!HI            ..##################################################################################################################################################################################################################");
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray3, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray6, strArray11);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("444hi!4444     ", strArray11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str7, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#####" + "'", str14, "#####");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str17, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str20, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("################################...", 69, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                 hiaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaaaaaaaaaa" + "'", str2, "hiaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                   4444444                   4444444", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("########################", "H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############" + "'", str1, "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    ...", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", 46);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("             hI!HI             hi", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                    ..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                    ..." });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 ih!ih     H " + "'", str1, "                 ih!ih     H ");
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("####################################################################################################################################################################################################################################################################", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ih!ih###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hihi", "!", "hih", "################################", "hih", "################################", "4444444444444444444444444444444444444444444444", "!", "hi", "!", "hihi", "!", "hih", "################################", "hih", "I", "!", "HI", "4444444444444444444444444444444444444444444444", "!", "HI", "!", "HI" });
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                        hI!HI            ", "aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444", 35, 387);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ", "                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " hI!HIhI!HIh################################", " " });
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 281, "AAAAAAA                         AAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AA  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AA  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                    Hi                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    Hi                                            " + "'", str1, "                                    Hi                                            ");
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                HI!HI!HI!AA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "HI!HI!HI!AA" });
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#######################################4444444444444444444444444444444444444444444444!HI!HIHI!HI", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################" + "'", str2, "######################################");
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###############################################hi#!#hi#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ih!ih##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH##################################" + "'", str1, "IH!IH##################################");
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", "                       a#HI!hi!hi!aa       a###");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", 10, " ######hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i" + "'", str3, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Ih!iHi!444Ih!iH", "", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Ih!iHi!444Ih!iH" });
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi" + "'", str1, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi");
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I!                                                                                                 ", 'a', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                           ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           " + "'", str2, "                                           ");
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####################################################", " 444HI!H444  ", "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################" + "'", str3, "####################################################");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    H  ", "         h         h         h         h        hi!         h         h         h         h         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H  " + "'", str2, "H  ");
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HhI!HI             ", "hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#" + "'", str1, "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#");
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           " + "'", str2, "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi        ", "44hi!hi!4444hi!hi!4444hi!hi!44", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!HIHI!HIH################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaah");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("ih!ihih!ih", strArray4);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("                    HI#HI                   ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str5, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str7, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                  ", ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("##### ######hi!hi", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##### ######hi!hi                            " + "'", str2, "##### ######hi!hi                            ");
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" H         H         H         H                    H         H         H         H", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        char[] charArray6 = new char[] { 'a', '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                        ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         h", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         h" });
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("############444HI!4444     ###############", "            hiHI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            hiHI!HI                           " + "'", str2, "            hiHI!HI                           ");
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             " + "'", str2, "                             ");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h####################################", "!hi!hihi!hih################################hi4!", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!i!", "################HI!HI################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!" + "'", str2, "!i!");
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         H         H         H         H        HI!         H         H         H         H         ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H        HI!         H         H         H         H         " + "'", str2, "    H        HI!         H         H         H         H         ");
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##############444hi!4444###############                                                                                                                                                                                                                                                                                                                       ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH", "         H         H         H         H        hi!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("I!HI                                       hiHI!HI                                       ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "hi!IhI!aaaaaaaaaaaaaaaaa", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hI!IIhI!IIh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!IIhI!II" + "'", str1, "hI!IIhI!II");
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH", "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################...###################################hi#!#hi#...#####################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h    h    h    h    h    h                                             h    h    h    h    h    h   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h h h h h h h h h h h h" + "'", str2, "h h h h h h h h h h h h");
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################", "         H         H         H         H        hi!         H         H         H         H         ", "4444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           ", 62, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444                                           4444444444" + "'", str3, "444444444                                           4444444444");
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "I!HI                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI                            " + "'", str1, "i!HI                            ");
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         H                      ", "             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###################...###################################hi#!#hi#...#####################", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################...###################################hi#!#hi#...#####################" + "'", str2, "###################...###################################hi#!#hi#...#####################");
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("I!    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I!" });
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AA  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                HI!HI!HI!AA", (java.lang.CharSequence) "                  ###############################################HI#!#HI#                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 71 + "'", int2 == 71);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############", 13, "h################################ Hi!hi hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############" + "'", str3, "#############");
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("############aaaaa###################################", "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", 65, "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str3, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhih" + "'", str2, "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhih");
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!i!i!i!", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i!" + "'", str2, "!i!i!");
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                              hi#hi                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!aa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaa", "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444", (java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 75 + "'", int2 == 75);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                                 ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "4444444444444444444", 874, 18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence6, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                   4444444                                                                          ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IH!IHIH!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", 25, "i!444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi" + "'", str3, "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#############################################HI!HI!##############################################hI!HI                           h################################", "!HIHI!HIH################################    ", "hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI!HI!##############################################hI!HI                           h################################" + "'", str3, "#############################################HI!HI!##############################################hI!HI                           h################################");
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("             hi   hI!HIhI!HIh                 ", 57, "!  !   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!  !              hi   hI!HIhI!HIh                 !  !  " + "'", str3, "!  !              hi   hI!HIhI!HIh                 !  !  ");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str2, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("            IH!Ih                           IH!IHih            IH!Ih                           IH", "                        hI!HI            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            IH!Ih                           IH!IHih            IH!Ih                           IH" });
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "##                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("################################...######################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!" + "'", str1, "                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!");
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                         aaaaaaa     ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                     I  I                   ", "", "    H        HI!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     I  I                   " + "'", str3, "                     I  I                   ");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH" + "'", str2, "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH");
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#############################################HI!HI!##############################################", "HI ! HI ! HI ! HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#############################################", "##############################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################################4##############################################" + "'", str4, "#############################################4##############################################");
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih", "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI" + "'", str3, "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI#HI                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", "################################...######################################################", 19, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str4, "################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("       ", 0, "                                                 Hhi!hihi!hih################################    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###################", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###################" + "'", str4, "###################");
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      H    ", "    #HI   Hi!hiHi!hiH", 31);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  hi!hi", "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!i!!i                           ii!!i            ii!i!!i                           ii!!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H         H         H         H        hi!         H         H         H         H", "...             hI!HI            hiHI!HI    ...", "###############################################HI################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H         H         H         H        hi!         H         H         H         H" + "'", str3, "H         H         H         H        hi!         H         H         H         H");
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!HI#################################hi!hi", "                            IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI#################################hi!hi" + "'", str2, "HI!HI#################################hi!hi");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ", "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 126 + "'", int2 == 126);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 62, 232);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 62 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" });
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "I!HI                           HI!HI                           H################################", "AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI" + "'", str3, "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hihi!hih################################    ", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              hi!hihi!hih################################                                                                                                   " + "'", str2, "                                                                                              hi!hihi!hih################################                                                                                                   ");
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "", 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI!HIhI!HIh################################", "          IH!IH                           IH!IHIH            IH!IH                           IH!IH", "hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hh##hhh##hh################################" + "'", str3, "hh##hhh##hh################################");
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hI#HHI   Hi!hiHi!hiH################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "###################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("#####################################################################################################################################################################################################################################################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hihi!hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                        ##############################################                                                                                                                                                        ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hihi!hi" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI                           HI!HI            HIHI!HI                           HI!HI           ", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "    h     ", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("####################################################################################################################################################################################################################################################################", 0, "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################################" + "'", str3, "####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "4444444444444444444444444444444444444444444444!", "", "", "hi!hihi!hih################################hi" });
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                                                " + "'", str1, "i!                                                                                                ");
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaahi!hi#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "##############     4444!ih444##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...# #444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...# #444444444444..." + "'", str1, "...# #444444444444...");
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 460, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ", "###########################################        ", 81);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI   Hi!hiHi!hiH################################", "#");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 998, 349);
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444!IH444", "hI!HI                           HI!HI            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                            hi!hi", "################################HhI!HI            ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                            hi!hi" });
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################..." + "'", str1, "################################...");
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih", 24, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!ihaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!HI!HI!HI!HI!", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...#", "I!                 ", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444", "I!                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  #########", "i!                                                                                                 ", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  #########" });
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!    ", strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444", "#############################################HI!HI!##############################################hI!HI                           h################################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("i!                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         " + "'", str1, "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
    }
}

