package org.apache.commons.lang3;

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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("444444", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444" + "'", str2, "444444");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h################################ hI!HI HI!HI", "HI!HI                           hI!HI            ...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "################################", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa" + "'", str2, "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "           hi!hi   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#####    H", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", "H         H         H         H        hi!         H         H         H         HHI!HIhI!HIh#######");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa" });
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                           hI!HI            hiHI!HI                           hI!HI             ", "!   hi!hihi!hihhi4!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI             " + "'", str2, "                           hI!HI            hiHI!HI                           hI!HI             ");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray4, strArray9);
        java.lang.String[] strArray12 = null;
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray12, strArray14);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray4, strArray14);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                    ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 393, 66);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "   " + "'", str18, "   ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "!ihh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                                                                                                                                                                                             !hihi!hi", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("         h####################################", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         h####################################" + "'", str2, "         h####################################");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", 162);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!4444    ", 18, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######HI!4444    " + "'", str3, "#######HI!4444    ");
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################hi!hi", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################################################################", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("            hiHI!HI                           ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "444444", 136, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "            ", "hi", "HI", "!", "HI", "                           " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#####    H     ", "Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####    H     " + "'", str2, "#####    H     ");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 350, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h" + "'", str3, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("h################################ h                                                                           ###################", "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...##########################################################################################...", "hI!HI", (int) (short) 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!IH!IH4444444444444444444444444444444444444444444444", 7, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...##########################################################################################..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###################################hi!hi################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("################################HhI!HI            ", "HI#HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh", "4444444444444444444444444!ih444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...44444444444444444HIHi!hiHi!h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("          IH!IH                           IH!IHIH            IH!IH  #############################", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #############################" + "'", str2, "  #############################");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   ", "  4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   " + "'", str2, "h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   ");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH", "IH#Ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH" });
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!hi                           hi!hi            hihi!hi                           hi!hi", ' ', 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 66 + "'", int3 == 66);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hiHi!hi", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       A#############################################AHIA!AHIA                        ", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!  !              hi   hI!HIhI!HIh                 !  !  ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        char[] charArray8 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                 !IH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H" + "'", str1, "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        hI!HI  ", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaa", "   !4444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("   hi!hihi!hih               hi!!hihi!hi!hihi!hi!hi", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                        hI!HI  " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "   hi!hihi!hih               hi!!hihi!hi!hihi!hi!hi" + "'", str7, "   hi!hihi!hih               hi!!hihi!hi!hihi!hi!hi");
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi" + "'", str1, "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi");
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi                           hi!hi            hihi!hi                        ...", "hi!h", 370);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi                           hi!hi       ...", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  hi!hi                           hi!hi       ..." + "'", str2, "                                                  hi!hi                           hi!hi       ...");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!IIih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hihi!hihihi!hihi!hi", "hi!                               ", 248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                        I!444");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("IH!IH##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH##################################" + "'", str1, "IH!IH##################################");
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hiHi!hi", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                 !IH", "h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                        IH!IH#############################################                       ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ..." + "'", str2, " ...");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      " + "'", str1, "      ");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444444444444444444444444444444444444hi!hi!", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444hi!hi!" + "'", str2, "4444444444444444444444444444444444444444444444hi!hi!");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 146 + "'", int1 == 146);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("H         H         H         H         !IH        ", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444HI!H444      ", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("         H                      ", "H         H         H         H        HI!         H         H         H         H", "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str1, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", 387);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" + "'", str2, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", "                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh" + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                   I!                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("            #############################   ", "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "            #############################   " });
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44hi!hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!4" + "'", str1, "44hi!hi!4");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("###################");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "4444444444444444444444444444444444444444444", 460, 9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", strArray8, strArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                             ...######                   I!                        ...######", strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "###################" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "###################" + "'", str12, "###################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  " + "'", str17, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HIaHIa#############################444444444...HIaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIaHIa#############################444444444...HIaaaaaaaaaaaaa" + "'", str1, "HIaHIa#############################444444444...HIaaaaaaaaaaaaa");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "hi", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI  4444444444444444444444444444444444444444444444!   AA!AAAA!AAA################################AAAI!HI  4444444444444444444444444444444444444444444444!   AA!AAAA!AAA################################AAA################################" + "'", str3, "I!HI  4444444444444444444444444444444444444444444444!   AA!AAAA!AAA################################AAAI!HI  4444444444444444444444444444444444444444444444!   AA!AAAA!AAA################################AAA################################");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", "44hi!hi!44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 !HIhI!HIh", "           hI!HI   ", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                              #############################################", "##                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                              #############################################" + "'", str2, "                                                                                                                                                                                                                                                              #############################################");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444                                           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hiHi!hiHIhi!hiHi!hi", "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################", "          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################" });
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", "HI!HIHI!HIH", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("AA", "I!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA" + "'", str2, "AA");
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                       A#############################################AHIA!AHIA                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                          ", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "hI!HIhI!HIh", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                          " + "'", str4, "                                          ");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!ihaaaaaaaaaaaaaaaaaaaaa", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     " + "'", str2, "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                  4444444444HI!HI!...                                                                                                                       ", "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                              HI#HI                                              ", "aaHI#HIaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA" + "'", str1, "AA");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi!hi!aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!HI                           hI!HI            hiHI!HI                           hI!H..", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     I!HI                           hI!HI            hiHI!HI                           hI!H..     " + "'", str2, "     I!HI                           hI!HI            hiHI!HI                           hI!H..     ");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "         H", (java.lang.CharSequence) "                     hi!hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "         H" + "'", charSequence2, "         H");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I!HI                           hI!HI            hiHI!HI                           hI!H..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           HI!HI            HIHI!HI                           HI!H.." + "'", str1, "I!HI                           HI!HI            HIHI!HI                           HI!H..");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 38, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      " + "'", str3, "                                      ");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "I!HIhiHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                             !ihIH!Ih                                            !i", "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaahi!hihi!hihihi!h", "                                                     ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        char[] charArray10 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaa#a...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI#HI");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("HI#HI", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hiHi!hiH################################", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                            HI!HI!HI!AA", strArray1, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI", "#", "HI" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI#HI" + "'", str10, "HI#HI");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                            HI!HI!HI!AA" + "'", str12, "                                            HI!HI!HI!AA");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444", "                       hiHI!HI              ", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444" + "'", str3, "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("############444HI!4444     ###############", 370, 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                           h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI   Hi!hiHi!hiH    ", "HII!HI                                       hiHI!HII!HI                           hI!HI        ", "               hiHI!HI               4444444444444444444", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI   Hi!hiHi!hiH    " + "'", str4, "HI   Hi!hiHi!hiH    ");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str1, "i!HI                           hI!HI            hiHI!HI                           hI!H...");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i!                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                              " + "'", str2, "i!                              ");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi", "hi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "     4444444444444444444444444444444444444444444444 hI!HI                           ", "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str4, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str1, "i!HI                           hI!HI            hiHI!HI                           hI!H...");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                             !ihIH!Ih                                            !i", "...############");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                             !ihIH!Ih                                            !i" });
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("################################", "#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################HI!HI!##############################################", "...##########################################################################################...", 35);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!IH!IH4444444444444444444444444444444444444444444444", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#############################################HI!HI!##############################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#############################################HI!HI!##############################################" + "'", str7, "#############################################HI!HI!##############################################");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!H", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H" + "'", str2, "HI!H");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 5, 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hiHi!hiHIhi!hiHi!h", "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh", 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hiHi!hiHIhi!hiHi!h" + "'", str3, "hi!hiHi!hiHIhi!hiHi!h");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         H                      ", "                       a#HI!hi!hi!aa       a###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH" + "'", str1, "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                    Hi                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "hi!                                            hI!HIhi!                                             ", 237);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!HI            " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str4, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...##### ######hi!hi", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...             hI!HI            hiHI!HI    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "444444444444444444444444444444444444...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 ", "HI!HI#################################hi!hi", 11);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hiaaaaaaaaaaaaaaaa", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 " + "'", str8, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hiaaaaaaaaaaaaaaaa" + "'", str9, "hiaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                              #############################################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                              #############################################" });
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaahi!hihi!hihihi!h", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH", 47, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH" + "'", str3, "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H################################ hI!HI HI!H", "IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "################################ h", "", "", "", " ", "", "", "", "" });
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!", (int) '#', (int) (byte) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################", strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "I!HI                           hI!HI                           h###############################", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       H         H", "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           H44H4h44H4hiH44H4h44H4H44H", "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           H44H4h44H4hiH44H4h44H4H44H" });
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                               ......!ih!ih!ih!ih!ih!ih!ih", "                                                                                                                                                             ##");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###########HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa", "###############################################hi#!#hi#############################################", "HIaHIa#############################444444444...HIa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHIHaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHIHaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444444444444###############################################4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##############444hi!4444     ##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI!HIhI!HIh################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HIhI!HIh################################" + "'", str2, "hI!HIhI!HIh################################");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "             HI   Hi!hiHi!hiH                 ", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########################################################################################################################################################################", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################################################################################################################################################" });
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "I!444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI  ", "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hhi!hihi!hih################################    ", "             HI   Hi!hiHi!hiH                 ", 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hhi!hihi!hih################################    " });
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ih#!#ih###############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                        ", "44hi!hi!4444hi!hi!4444hi!hi!44", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        " + "'", str3, "                        ");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                           ##", "                                                               ......!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                           HI!HI                           H###############################", "", 75);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HIH###############################" + "'", str4, "HI!HIH###############################");
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h    h    h    h    h    h                                             h    h    h    h    h    h  ", "          IH!Ih                           IH!IHih   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("     4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                            IH!I");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH!I" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!I" + "'", str3, "IH!I");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HI!HI!HI!HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI" + "'", str3, "HI#HI");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#HI" + "'", str4, "HI#HI");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444hI!HI                           hI!HI                           h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444hI!HI                           hI!HI                           h" + "'", str1, "4444444hI!HI                           hI!HI                           h");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###########################################", "                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "" };
        int int23 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray22, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray15, strArray22);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray22, 'a');
        int int37 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", strArray22);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str34, "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!aa" + "'", str36, "hi!aa");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 43 + "'", int37 == 43);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...###################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###################################hi#!#hi" + "'", str1, "...###################################hi#!#hi");
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!IIih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "#############", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#############" + "'", charSequence2, "#############");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("           H44H4h44H4hiH44H4h44H4H44H", "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi                           hi!hi       ...", "  hiHI!HI ", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i !iIIIIIIIIIIIIIIIIIIIIIIIIIII!i !iIIIIIII..." + "'", str3, "!i !iIIIIIIIIIIIIIIIIIIIIIIIIIII!i !iIIIIIII...");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...##### ######hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      4444444444444444444444444444444444444444444444", (int) (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      4444444444444444444444444444444444444444444444" + "'", str3, "      4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHi!hiHi!hi#Hi!hiHi!hiHI", "                                                                                                    ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!HI                                       hiHI!HI                                       ", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHi!hiHi!hi#Hi!hiHi!hiHI" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str6, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str8, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str9, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...#I!HI", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#I!HI" + "'", str2, "...#I!HI");
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("############aaaaa###################################", "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray7, strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "         H         H         H         H        hi!         H         H         H         H         ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray7);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "############aaaaa###################################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                " + "'", str12, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H         H         H         H                    H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!   " + "'", str1, "!   ");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("################################HhI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################HHI!HI            " + "'", str1, "################################HHI!HI            ");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###hiHI!HI###########################hI!HI##########", (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...H!IH                           IH!IHIH            IH!IH                           IH!I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "H", "!", "IH", "                           ", "IH", "!", "IHIH", "            ", "IH", "!", "IH", "                           ", "IH", "!", "I" });
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          Hi!hi               ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                          Hi!hi               " });
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!hi!hi                           Hi!hi            HIhi!hi              ", "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI#HHI   Hi!hiHi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI#HHI", "Hi!hiHi!hi" });
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                               ", "hi!hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!HI                           ", "#################################hi!                               #################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "I!HI                           HI!HI  444   4444HI!HI                           HI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       4#############################################4hi4!4hi4                        ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       4#############################################4hi4!4hi4                        " });
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           " + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444", "Hi!hi###########################hi!hi############hihi!hi###########################hi!hi############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444hi!4444     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...H!IH                           IH!IHIH            IH!IH                           IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...H!IH                           IH!IHIH            IH!IH                           IH!I" + "'", str1, "...H!IH                           IH!IHIH            IH!IH                           IH!I");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                              I!", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I!" + "'", str2, "                                                                                              I!");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("            ih!ih                           ih!ihih            ih!ih                           ih!ih", "         H                      ", 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##############444hi!4444     ##############", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############444hi!4444", "", "", "", "", "##############" });
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      ", "       IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      " + "'", str2, "HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      ");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI!", "HI!HI                           HI!HI                           H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI                           H" + "'", str2, "                           HI!HI                           H");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  IH!Ih4444444444444444444444444444444444444444444444  ", "444444444444444444444444444444444444...", "      4     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  IH!Ih4444444444444444444444444444444444444444444444  " + "'", str3, "  IH!Ih4444444444444444444444444444444444444444444444  ");
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###############################################..##..#############################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih", "                                                                                                                                                                                                                                                                                                                                                              ", "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI   Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI   Hi!hiHi!hiH" + "'", str1, "HI   Hi!hiHi!hiH");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI#HI", "HI!HI                           hI!HI            ...", "                            ##################################hi!hi                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  #  " + "'", str3, "  #  ");
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44hi!hi!4444hi!hi!4444hi!hi!44", "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44hi!hi!4444hi!hi!4444hi!hi!44" });
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###hiHI!HI###########################hI!HI##########", 7, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI", "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444444444444444444444444444444444444!", "                        ", 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str3, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaah", " i  i i  i i i  i i  i444    444 i  i i  i i i  i i  i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaah" + "'", str2, "aaaaaaaaah");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  hi!hi", "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        int int20 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!                               ", strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("hi!                               ", strArray6, strArray19);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!" + "'", str14, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!                               " + "'", str22, "hi!                               ");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...#I!HI", "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                            IH!I", "I!HIhiHI!HI", "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            h!ih" + "'", str3, "                            h!ih");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############", 229);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############" + "'", str2, "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                44hi!hi!4444hi!hi!4444hi!hi!44", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                44hi!hi!4444hi!hi!4444hi!hi!44" + "'", str3, "                44hi!hi!4444hi!hi!4444hi!hi!44");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!HIHI!HIH", "                                                            444!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HIH" + "'", str2, "HI!HIHI!HIH");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "Hi        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#########################I!HI   ", "#########################I!HI   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444" + "'", str1, "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "AAAAAIHAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" + "'", str2, "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!HI                           hI!HI  444   4444hI!HI                           hI!HI ", "#############################################HI!HI", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HIHI!HIHIHI!HIHI!HI", (java.lang.CharSequence) "         h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...##########################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########################################################################################..." + "'", str1, "...##########################################################################################...");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("IH IH###################################", "H     hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH IH###################################" + "'", str2, "IH IH###################################");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##### ######hi!hi                            ", 9, "    !I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##### ######hi!hi                            " + "'", str3, "##### ######hi!hi                            ");
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH", "I!    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH" });
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##############444hi!4444     ###############", "hi!aa", 11);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##############444hi!4444     ###############" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##############444hi!4444     ###############" });
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "       ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#####    H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H    #####" + "'", str1, "H    #####");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################", "444!       H      H      H      H   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################" + "'", str2, "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H" + "'", str1, "hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", "444444", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   " });
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "hi!hihi!hih################################                                                   A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  ", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA", "##########################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA" });
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444HI!HI!...", "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", "hi!                                ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              " });
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!                                            hI!HIhi!                                             ", "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", str2, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h#################################hi#hi#hi#hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############hi#!#hi#" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############hi#!#hi#");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                ", "####################################", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                " });
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("             #############################             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             #############################            " + "'", str1, "             #############################            ");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "44444444444444444444444444###############################################444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str2, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI", "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI" + "'", str2, "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", "#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI                           HI!HI                           H", (java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!   hi!hihi       ################################        ", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ih#!#ih###############################################", "hi!HI!HI!HI!HI!                              ", "IhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih#!#ih###############################################" + "'", str3, "ih#!#ih###############################################");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#############################################", "hI!HI                           HI!HI            HIHI!HI                           HI!HI", "4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################" + "'", str3, "#############################################");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI", "hiHI!HI                           hI!HI             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###################");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###################" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################" + "'", str2, "###################");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###################" + "'", str5, "###################");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "###################" + "'", str7, "###################");
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##############################################hI!HI                           h################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI", 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################", "", "", "", "", "", "##############################################", "", "", "", "", "                           ", "################################" });
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HIHI!HIH", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HIH" + "'", str2, "HI!HIHI!HIH");
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HhI!HI            ", "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!IHHI            " + "'", str3, "H!IHHI            ");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "#############################################hi!hi!#############################################", 324);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("HI   HI!HIHI!HIH################################    ", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################", "HIHi!hiHi!hi#Hi!hiHi!hiH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("..", "hi#hi", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#HI" + "'", str1, "hI#HI");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", "I!HI                           hI!HI                           h################################", "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444" + "'", str3, "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "HI!                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!hiHi!hiH########################" });
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                 HI!HIhI!HIhiHI!HIhI!HIHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 HI!HIhI!HIhiHI!HIhI!HIHI" + "'", str1, "                 HI!HIhI!HIhiHI!HIhI!HIHI");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        char[] charArray17 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray17);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray17);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray17);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray17);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray17);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!   ", charArray17);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444", charArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", charArray17);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HIHI!HIH##############...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "# Hi!hi hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   " });
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "...#", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#########H#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########H#####" + "'", str1, "#########H#####");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444###############################################444444444444444444444444444", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          ###############################################                           " + "'", str3, "                          ###############################################                           ");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###################################", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...", charArray15);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      444444444", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str1, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!   hi!hihi       ################################        ", "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH", "###", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!   hi!hihi       ################################        " + "'", str4, "!   hi!hihi       ################################        ");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###################################HI!HI################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI            ..", "444!hi!h444444444444444444444444444hi!h4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI                           HI", "HI            .." });
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444444444444444444444Hi!hiHi!hi", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444Hi!hiHi!hi" + "'", str2, "44444444444444444444444444444444444444444444Hi!hiHi!hi");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "                                             I!                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44H4H44H", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44H4H44H" });
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI                           HI!HI            ...", "######################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HIhI!HIhiHI!HIhI!HI", "##########", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", "                                                                                                             I!HIhI!HIh################################                                                                                                              ", "...###################################hi#!#hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI   Hi!hiHi!hiH               Hi!", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI   Hi!hiHi!hiH               Hi!" + "'", str3, "hI   Hi!hiHi!hiH               Hi!");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    H                                      ", "hI#HI!HI                           HI!HI            ..", "                            h          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           " + "'", str3, "                                           ");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!i!i                                                                                                                                                                                                                                        ", '#', 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                    Hi                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    Hi                                             " + "'", str1, "                                    Hi                                             ");
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                             ", "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "ih!ih                                             ", "IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##############     4444!ih444##############", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################4444!ih444##############" + "'", str3, "###################4444!ih444##############");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!HI!HI!HI!HI!                              ", 17, "IAHI                           hIAHI            hAHIAHI                           hIAHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!HI!HI!HI!HI!                              " + "'", str3, "hi!HI!HI!HI!HI!                              ");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...######################", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                             ", 1, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         H         H         H         H        " + "'", str1, "!         H         H         H         H        ");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("iH!IH#############################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("        HI!         H         H         H         H", 248, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           hi!hi                           hi!hi            hihi!hi                           hi!hi                  HI!         H         H         H         H" + "'", str3, "hi!hi                           hi!hi            hihi!hi                           hi!hi           hi!hi                           hi!hi            hihi!hi                           hi!hi                  HI!         H         H         H         H");
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                             ...######                   I!                        ...######", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###### I! ...######" + "'", str2, "...###### I! ...######");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                           hi!hihi!hih################################hi4!  ", "    H     ", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                           hi!hihi!hih################################hi4!  " });
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaa                         aaaaaaa     ", "4444444", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) " hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  " + "'", str2, "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          ################################", "i!                                                                                                 ", "...                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ################################" + "'", str3, "          ################################");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H" + "'", str2, "         H");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI" + "'", str1, "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###########################################        ", "...                           hi!hi            hihi!hi                           hi!hi          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################        " + "'", str2, "###########################################        ");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HIHI!HIH################################", "                 ih!ih     H ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HIH################################" + "'", str2, "HI!HIHI!HIH################################");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################" + "'", str1, "###################################################");
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444" + "'", str1, "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###################################################", 52, "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################H" + "'", str3, "###################################################H");
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##                                                                                                                                                             ", "      H         H         H         H         !ih        H         H         H         H         ", 48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##                                                                                                                                                             " });
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray3, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                    " + "'", str9, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ihaaaaaaaaaaaaaaaaaaaaa", "ihHhihihihih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "!ihaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" });
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...hhi...", (java.lang.CharSequence) "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          IH!IH                           IH!IHIH            IH!IH  #############################", "                                                 Hhi!hihi!hih################################    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          IH!IH                           IH!IHIH            IH!IH  #############################" });
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi" + "'", str1, "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!                                ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa", "HI!HIH###############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "############4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("###################################", "                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444", 44, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("......!ih!ih!ih!i", 'a', 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", "444444444                                           4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("ih!ih###################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!HIHI!HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       hiHI!HI              ", "hi!ih!ihih!ih");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "HIHI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI" + "'", str4, "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                       ", "", "HI", "HI              " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ih                       ih##################################ih                       ih##################################ih                       ih###############################hI                       HI                                         ih                       ih##################################ih                       ih##################################ih                       ih###############################" + "'", str8, "ih                       ih##################################ih                       ih##################################ih                       ih###############################hI                       HI                                         ih                       ih##################################ih                       ih##################################ih                       ih###############################");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HIHI!HIH", "HI!hi!hi!aaHI!hi!hi!aaHI!hi!h.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HIH" + "'", str2, "HI!HIHI!HIH");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 0, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "####################################################################################################################################################################################################################################################################");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#######HI!4444    ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!                                          44HI444HI!                                          ", "...###################################hi#!#hi", 31, 346);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                            ...###################################hi#!#hi" + "'", str4, "HI!                            ...###################################hi#!#hi");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I!                              ", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                              " + "'", str2, "I!                              ");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "...###### I! ...######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI", "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444", "..." });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                                       #############################################", "aAAAAihAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   hiHI!HI                           hI!HI          ", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hiHI!HI                           hI!HI          " + "'", str2, "                           hiHI!HI                           hI!HI          ");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                               " + "'", str2, "HI!                               ");
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence6, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###########HI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################", "                          ###############################################                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("      Hhi!                                     ", 25, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      Hhi!                                     " + "'", str3, "      Hhi!                                     ");
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...               A#############################################AHIA!AHIA            ...", "#I!HI#I!HI", "4444!IH444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...               A#############################################AHIA!AHIA            ..." + "'", str3, "...               A#############################################AHIA!AHIA            ...");
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!                            ...###################################hi#!#hi", 48, 103);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################hi#!#hi" + "'", str3, "#####################hi#!#hi");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h    h    h    h    h    h                                             h    h    h    h    h    h   ", "444444444                                           4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hI#HI!HI                           HI!HI            ..", "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   !4444444444444444444444444444444", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444" + "'", str2, "44444444444444444444444444444");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H################################ h                                                                           ###################", "     4444444444444444444444444444444444444444444444 hI!HI                           ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h#################################hi#hi#hi#hi", "IH#Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH#Ih" + "'", str2, "IH#Ih");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("444hi!4444", "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", (int) (byte) -1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HIHI!HIH################################", strArray5, strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                   ", "HI!hi!hi!aa", (int) (byte) 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("HIHI!HI", strArray9, strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!HIHI!HIH################################" + "'", str10, "HI!HIHI!HIH################################");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "                                   " });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HIHI!HI" + "'", str15, "HIHI!HI");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444!   444hi!4444   ", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444!   444hi!4444   " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   444hi!4444   " });
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", 460, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h" + "'", charSequence2, "ihi!iihi!iihi!iihi!iihi!iihi!iihi!i!h!h");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###hiHI!HI###########################hI!HI##########", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###hiHI!HI###########################hI!HI##########" });
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                               ###################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "  #############################", "                       hiHI!HI              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444444444444444444444444444444444444!HI!HIHI!HI", "Hi!hiHi!hiH", (int) (short) 10, 137);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHi!hiHi!hiH" + "'", str4, "HHHHHHHHHHHi!hiHi!hiH");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI", "##############################i!!                               #################################", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hi!hiHi!hiH########################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       a#############################################ahia!ahia                        ", " H     hi!hi                 ", 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", 84, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                       a#############################################ahia!ahia                        " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#hi!hi#hihihi#", "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444", 342, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444" + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                           h", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           h" + "'", str2, "                           h");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                       A#############################################AHIA!AHIA                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "ih!ih#############################################", 162, 350);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI   Hi!hiHi!hiH################################      hiHI!HI          ih!ih#############################################" + "'", str4, "HI   Hi!hiHi!hiH################################      hiHI!HI          ih!ih#############################################");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("             HI   Hi!hiHi!hiH                 ", "4444444hI!HI                           hI!HI                           hI!HI                        ", 81);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "             HI   Hi!hiHi!hiH                 " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!                                            hI!HIhi!                                             ", "                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                           HI!HI                           H################################", '#', 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", 85, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI" + "'", str3, "HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!IHHI                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI#HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI#HI", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hiHi!hi");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass13 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "#", "HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI#HI" + "'", str8, "HI#HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str10, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "HI", "#", "HI" });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!hi                           hi!hi            hihi!hi                           hi!hi            ", "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi                           hi!hi            hihi!hi                           hi!hi            " + "'", str2, "i!hi                           hi!hi            hihi!hi                           hi!hi            ");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ", 50, "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           " + "'", str3, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...hhi...", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...hhi..." });
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                    ", strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 0, (int) (byte) 0);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                     ##########", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!HI                           HI!HI            ...", "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "... ...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI            ..." + "'", str3, "HI!HI                           HI!HI            ...");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hiHi!hiHIhi!hiHi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hiHi!hiHIhi!hiHi!h" + "'", str1, "hi!hiHi!hiHIhi!hiHi!h");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hI!HI            hiHI!HI                           hI#### ######hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                   ih!ihih!ihihih!ihih!ih", "#############################################4##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!4444     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4444" + "'", str1, "hi!4444");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                              hi#hi                                              ", "I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i" });
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...######                   I!                        ...######", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444HI!HI!...                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444HI!HI!...", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!HI", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI" + "'", str3, "I!HI");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI", "                                                                                                                                                                                                                                                                   ih!ihih!ihihih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI" + "'", str2, "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI          " + "'", str1, "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444   4444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444", "4444" });
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "HI!HIHI!HIH################################", "         H         H         H         H        HI!         H         H         H         H         ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...##########################################################################################...", "HI!HIHI!HI", 4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("H         H       ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "...##########################################################################################..." });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "H         H       " + "'", str9, "H         H       ");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                    " });
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I!HI                           hI!HI                           h################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", "HI!HI                           HI!HI                           H################################                                        ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                  ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  " + "'", str2, "                                                                  ");
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaHI#HIaaa", 53, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaHI#HIaaa                                           " + "'", str3, "aaHI#HIaaa                                           ");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###########################                                                             H                                       44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444" + "'", str1, "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!444", "aaaaaaaaaaaHI!HI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                            HI!HI!HI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI" + "'", str2, "HI!HI!HI");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           hi!hiHi!hiHIhi!hiHi!hihi!h", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!", "#I!HI#I!HI", 281);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!" + "'", str3, "444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!IhI!aaaaaaaaaaaaaaaaa", 136, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        hi!IhI!aaaaaaaaaaaaaaaaa                                                        " + "'", str3, "                                                        hi!IhI!aaaaaaaaaaaaaaaaa                                                        ");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaHI!HI!", 873, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaHI!HI!########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "aaaaaaaaaaaHI!HI!########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi", 8, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "                              " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                              " + "'", str4, "hi!                              ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!HI!HI!HI!HI!                              " + "'", str7, "hi!HI!HI!HI!HI!                              ");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!hi!hihi!hih################################hi4!", 31, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################################################################################################################################################################################################################", "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################################################################################################################################################################################################################" });
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hiH########################", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##############################################", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                        hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                             I!HIhI!HIh################################                                                                                                              ", 137, "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                             I!HIhI!HIh################################                                                                                                              " + "'", str3, "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################" + "'", str2, "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################");
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaa", "   !4444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                       A#############################################AHIA!AHIA                        ", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A#############################################AHIA!AHIA    ..." + "'", str2, "                       A#############################################AHIA!AHIA    ...");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                            HI#HI                            ", "hi#h", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       #############################################hi!hi                        ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                       ", "#############################################", "hi", "!", "hi", "                        " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       ###############################################hi#!#hi#                        " + "'", str3, "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                       ", "#############################################", "", "", "", "                        " });
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI#################################hi!hi", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#############################################HI!HI", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Hi!hi###########################hi!hi############hihi!hi###########################hi!hi############");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    H     hi!hi                 ", '4', 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                 h                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hI!HI            hiHI!HI                           hI#### ######hi!hi", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Ih!ih#############################################", "                                                                                                                                                                                                                                                                                                                                                        I!444", "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!ih#############################################" + "'", str3, "Ih!ih#############################################");
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih!ih", "...##########################################################################################...", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##############     4444!IH444##############", (int) (byte) 0, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############     4444!IH4" + "'", str3, "##############     4444!IH4");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                           ih!ihih!ih                                                                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...             hI!HI            hiHI!HI    ...", 47, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...             hI!HI            hiHI!HI    ..." + "'", str3, "...             hI!HI            hiHI!HI    ...");
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("IH!IH                           IH!IHIH            IH!IH                           IH!IH", "         h####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("i!hiHi!hiH################################", "HI!HI#################################hi!hi         ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("########################", "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################" + "'", str2, "########################");
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "            hiHI!HI                                       hiHI!HI               4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IAHI                           hIAHI            hAHIAHI                           hIAHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                            ##################################hi!hi                             ", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI                           HI!HI            ...", strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "###############################################hi#4#hi#############################################");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                 HI!HIhI!HIhiHI!HIhI!HIHI", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 HI!HIhI!HIhiHI!HIhI!HIHI" + "'", str2, "                 HI!HIhI!HIhiHI!HIhI!HIHI");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444!   444hi!4444   ", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444!   444hi!4444   " + "'", str2, "4444444444444444444444444444444!   444hi!4444   ");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4            4", "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444444!   444hi!4444   ", "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "                                              hi#hi                                              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!444" + "'", str1, "I!444");
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("       ################################        ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ################################        " + "'", str2, "       ################################        ");
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444###############################################4444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444###############################################4444444444444444444444444444" });
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      HI!HI#################################hi!hi                        ", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI!HI#################################hi!hi                        " + "'", str2, "      HI!HI#################################hi!hi                        ");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                   ", "AAAAAAAAAAAAA", 41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                   " });
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("###############################################hi#4#hi", "I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                        hI!HI  ", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hI!HI  " + "'", str3, "                        hI!HI  ");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ihaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!ihaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("         h####################################", "###############################################hi#!#hi#############################################", 43);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         " });
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44H4H44H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44HI444", "############aaaaahi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44HI444" + "'", str2, "44HI444");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################HI!HI", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                      h    ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                  ########                  ########");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hihi!hih44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih44444444444444444444444444444444" + "'", str1, "hi!hihi!hih44444444444444444444444444444444");
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI#HI!HI                           HI!HI            ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                          " + "'", str4, "                          ");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  !4ih################################hih!ihih!ih   !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  !4ih################################hih!ihih!ih   !" + "'", str1, "  !4ih################################hih!ihih!ih   !");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                          hI!HI               ##############     4444!ih444##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                              HI#HI                                              ", "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!i !iIIIIIIIIIIIIIIIIIIIIIIIIIII!i !iIIIIIII...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...###################################hi#!#hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...###################################hi#!#hi" });
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!hi!hi!aaHI!hi!hi!aaHI!hi!h.", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hi!hi!44HI!hi!hi!44HI!hi!h." + "'", str3, "HI!hi!hi!44HI!hi!hi!44HI!hi!h.");
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 131 + "'", int3 == 131);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444", "                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i", '#', 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("     I!HI                           hI!HI            hiHI!HI                           hI!H..     ", "       IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444", "        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444" + "'", str2, "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi", 69);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         " });
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!H     hi!hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }
}

