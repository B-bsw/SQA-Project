package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "HI!H", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...######                   I!                        ...######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...######                   I!                        ...######" + "'", str1, "...######                   I!                        ...######");
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###############################################hi#4#hi#############################################", "#####!#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#4#hi" + "'", str2, "###############################################hi#4#hi");
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###############################################");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###############################################" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################" + "'", str2, "###############################################");
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", "hi!ih!ihih!ih", 350);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                       #############################################", ' ', 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi###", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444hihI!HIhI!HIh################################!hi###" + "'", str2, "4444444444444444444444444hihI!HIhI!HIh################################!hi###");
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("     4444444444444444444444444444444444444444444444      ", "##########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444HI!H444      ", "...H!IH                           IH!IHIH            IH!IH                           IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444      " + "'", str2, "444HI!H444      ");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaa!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!  !              hi   hI!HIhI!HIh                 !  !  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!  !              hi   hI!HIhI!HIh                 !  !" + "'", str1, "!  !              hi   hI!HIhI!HIh                 !  !");
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...###################################hi#!#hi", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...###################################hi#!#hi" });
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI   Hi!hiHi!hiH");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HIHI!HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIH" + "'", str1, "HI!HIHI!HIH");
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", (java.lang.CharSequence) "#####    H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#I!HI#I!HI", 19, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     I  I                   ", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                       #############################################hi!hi                        ", 258);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                        #############################################hi!hi                        " + "'", str2, "                                                                                                                                                                                        #############################################hi!hi                        ");
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("            HIHI!HI                          ", 9, "HHI!                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            HIHI!HI                          " + "'", str3, "            HIHI!HI                          ");
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!", (int) '#', (int) (byte) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################HI!HI!##############################################", "...##########################################################################################...", 35);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!IH!IH4444444444444444444444444444444444444444444444", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##", strArray2, strArray11);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "#############################################HI!HI!##############################################" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##" + "'", str13, "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("Hi        ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hiHi!hi", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hi" + "'", str3, "Hi!hiHi!hi");
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#hhi   hi!hihi!hih################################", "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi#hhi   hi!hihi!hih################################" });
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444" });
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  444!       H      H      H      H      ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!IH!IH4444444444444444444444444444444444444444444444                   ..." + "'", str1, "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       a#############################################ahia!ahia", "#################44HI444", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        char[] charArray9 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                    ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!HI                           ", 260, "ih!ih##################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################" + "'", str3, "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################");
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "...                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        char[] charArray14 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       a#############################################ahia!ahia", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################..", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HII!HI                                       hiHI!HII!HI                           hI!HI        ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          ################################", "4444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          ################################" });
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...##########################################################################################...", "HI!HIHI!HI", 4);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...##########################################################################################..." });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HIHI!HI", 998);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HIhI!HIhiHI!HIhI!HIHI!H", 94, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HIhI!HIhiHI!HIhI!HIHI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HIhI!HIhiHI!HIhI!HIHI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44!IH!IH4444!IH!IH4444!IH!IH44                ", "iH!IH#############################################", "                                             I!                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44!IH!IH4444!IH!IH4444!IH!IH44                " + "'", str3, "44!IH!IH4444!IH!IH4444!IH!IH44                ");
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!##", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                           ", "...###################################hi#!#hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                           " });
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444!       H      H      H      H   ", (int) (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444!       H      H      H      H   " + "'", str3, "444!       H      H      H      H   ");
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ", "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", "                 HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##" });
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "            hiHI!HI                                       hiHI!HI               4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "hi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI" + "'", str2, "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!HIHI!HIH##############...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!HIHI!HIH##############..." });
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH" + "'", str1, "             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH");
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                     ##########", (java.lang.CharSequence) "i!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ", 15, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     " + "'", str3, "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ");
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str3, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       IH!IH                           IH!IH" + "'", str1, "       IH!IH                           IH!IH");
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!hi", "!i!i!i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 !ih", "                     hi!hi", 873);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", 37, 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 !ih" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...#I!HI", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...#I!HI" + "'", charSequence2, "...#I!HI");
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                        hI!HI  ", "                     I  I                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hI!HI  " + "'", str2, "                        hI!HI  ");
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                              hi!hihi!hih################################                                                                                                   ", 277, "h################################ Hi!hi hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   " + "'", str3, "h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   ");
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIHI!HIH################################", "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  #########", "h    h    h    h    h    h                                             h    h    h    h    h    h   ", 393);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  #########" });
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI   Hi!hiHi!hiH################################" + "'", str1, "HI   Hi!hiHi!hiH################################");
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "        444hi!4444              ", "Hi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "    H     hi!hi                 ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH");
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "         h", (java.lang.CharSequence) "#############################################HI#HI###############################################hI#HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...                                ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "                                " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444hI!HI", "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH", (int) (byte) -1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                        ##############################################                                                                                                                                                        ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444hI!HI" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 232, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", "# hI!HI hiHI!HI hI!HI I!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "                        hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!  !              hi   hI!HIhI!HIh                 !  !");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##### ######hi!hi                            ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Ih!iH                           ih!ihIH            ih!iH                        ...", "hi!hihi!hih################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                        ..." + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                        ...");
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                HI!HI!HI!AA", (java.lang.CharSequence) "aaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("           hi!hi   ", "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", 55, 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "           hi!hi                                                                                                                                                                                            HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str4, "           hi!hi                                                                                                                                                                                            HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ihhhI!                 ", "                       #############################################HI!HI                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str2, "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                                       hiHI!HI");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444##################################HI!HI4444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("A#############################################AHIA!AHIA                                                 !HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444!   ", "                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############", "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    H        HI!         H         H         H         H         ", (java.lang.CharSequence) "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("############ih!ih##################################", "                    HI#HI                   ", "                                                                           ###################", 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############ih!ih##################################" + "'", str4, "############ih!ih##################################");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                          444hi!4444I!HI!HI!HI!                              ", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          444hi!4444" + "'", str2, "                                          444hi!4444");
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##################################", "hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################" + "'", str2, "##################################");
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...###################################hi#!#hi#", "...###################################hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH", "    H         H         H         H      ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH" });
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HIHI!HIH################################" + "'", str1, "hI!HIHI!HIH################################");
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        char[] charArray11 = new char[] {};
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################HI!HI", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                    ih ih ih ih ih ih ih", charArray11);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################################hi#!#hi#                                 ", charArray11);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          IH!IH                           IH!IHIH            IH!IH                           IH!IH", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ", "aaaaha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H################################ hi#hi hi#hi", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      444444", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H#################################hi#hi#hi#hi" + "'", str3, "H#################################hi#hi#hi#hi");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                             !ihIH!Ih                                            !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             !ihIH!Ih                                            !i" + "'", str1, "                                             !ihIH!Ih                                            !i");
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 3, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                             ##", "Hi        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             ##" + "'", str2, "                                                                                                                                                             ##");
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ", 162);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "" };
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray9);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray9, strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray9);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "" };
        int int27 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray26);
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray26, strArray34);
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "" };
        int int42 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray41, strArray49);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray34, strArray41);
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray9, strArray41);
        int int53 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray41);
        boolean boolean54 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444   hiHI!HI                           hI!HI", strArray41);
        boolean boolean55 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", strArray41);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " " + "'", str52, " ");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  444!       H      H      H      H      ", "###############################################   hi#hihi#hih################################h", 48, 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  444!       H      H      H      H      ###############################################   hi#hihi#hih################################h" + "'", str4, "  444!       H      H      H      H      ###############################################   hi#hihi#hih################################h");
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI   Hi!hiHi!hiH################################    ", 27, "    H     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI   Hi!hiHi!hiH################################    " + "'", str3, "HI   Hi!hiHi!hiH################################    ");
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "    h     ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################IH#I", "I!HI", "I!HI", "################################" });
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###############################################hi#!#hi#", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!#######", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!#######" + "'", str8, "hi!#######");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HIHI!HIH################################HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hihi!hih################################hi" + "'", str1, "hi!hi!hihi!hih################################hi");
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###########################################        ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###########################################        " + "'", charSequence2, "###########################################        ");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", "", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 98 + "'", int1 == 98);
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444HI!HI!...", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444HI!HI!..." });
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#######################################4444444444444444444444444444444444444444444444!HI!HIHI!HI", "#################################################################################################", "HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444444444444444444444444444444444444!HI!HIHI!HI" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444444444444444444444444444444444444!HI!HIHI!HI");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                        HI!HI                           H###############################", "  hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################" + "'", str2, "###############################");
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(".", "4444444                   4444444", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                 ", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI   Hi!hiHi!hiH################################", "                                      444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("           HI!HIhI!HIhiHI!HIhI!HIHI!H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           HI!HIhI!HIhiHI!HIhI!HIHI!H" + "'", str2, "           HI!HIhI!HIhiHI!HIhI!HIHI!H");
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444hI!HI                           hI!HI                           hI!HI                        ", "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444hI!HI                           hI!HI                           h" + "'", str2, "4444444hI!HI                           hI!HI                           h");
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", 18, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         h         h         h         h        hi!         h         h         h         h         ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         h         h         h         h        hi!         h         h         h         h         " + "'", str3, "         h         h         h         h        hi!         h         h         h         h         ");
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "        444hi!4444              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                           hI!HI            hiHI!HI                           hI!HI            #", "################################HhI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          ################################", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ################################" + "'", str3, "          ################################");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#####!#####", "444!hi!h444444444444444444444444444hi!h4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str2, "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ihhhI!                 ", "HI!HI#################################HI!HI444444444", "...hhi...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("     4444444444444444444444444444444444444444444444 Hi!hi                           ", "aaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                           HI!HI                           H################################", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi" + "'", str1, "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi");
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("       IH!IH                           IH!IH", "44444444444444444444444444444444", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih                                             ", "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih                                             " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih!ih                                             " + "'", str4, "ih!ih                                             ");
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!IhI!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                          hI!HI               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("......!ih!ih!ih!ih!ih!ih!ih", "44hh44h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("######################################", "Hhi!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################", "Hi!hiHi!hiH########################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##############hihHhihihihih################################hih################################!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihHhihihihih################################hi" + "'", str2, "ihHhihihihih################################hi");
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hh##hhh##hh################################", "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####!#####", "      HI!HI#################################hi!hi                        ", 46);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                          HI!HI!HI!AA", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 277 + "'", int5 == 277);
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I!HI", "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###############################################hi#!#hi#", "...             hI!HI            hiHI!HI    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi#" + "'", str2, "###############################################hi#!#hi#");
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray10, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray5, strArray10);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray18);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, '#', (int) (short) 10, 5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray10, strArray18);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                                " + "'", str15, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!                                                                                                 " + "'", str24, "hi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                           hI!HI            hiHI!HI                           hI!HI            #", "##########################################################################################################################################################################", "  444!       H      H      H      H      ###############################################   hi#hihi#hih################################h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI             " + "'", str3, "                           hI!HI            hiHI!HI                           hI!HI             ");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("IH!IH##########Hi!hiHi!hiH##################################################", "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("            IH!Ih                           IH!IHih            IH!Ih                           IH", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444", "   ##HI#HI                           #I#HI           4             #I#HI      #IH#IH4#4HI#HI      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#######################################", "                                                 h                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################" + "'", str2, "#######################################");
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  4444444444444444444", "    H     hi!hi                 ", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "4444444444444444444" });
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44hi!hi!4444hi!hi!4444hi!hi!44", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44" + "'", str2, "44hi!hi!4444hi!hi!4444hi!hi!44");
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444!IH444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444!IH444" + "'", str1, "4444!IH444");
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!444", "                       a#############################################ahia!ahia");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I", "444" });
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444             " + "'", str2, "444444444444444444444444444444             ");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!", "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!#######", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!#######" });
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                        ##############################################                                                                                                                                                        ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", strArray2, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str9, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##############################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...H!IH                           IH!IHIH            IH!IH                           IH!I", 8, 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...H!IH                           IH!IHIH            IH!IH                           IH!I" + "'", str3, "...H!IH                           IH!IHIH            IH!IH                           IH!I");
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...", 51, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################..." + "'", str3, "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...");
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("I!HI                           hI!HI                           h################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("################################...######################################################", "...##########################################################################################...", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "################################...######################################################" });
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                    HI#HI                    ", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H################################ Hi!hi hi!hi", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "# Hi!hi hi!hi" + "'", str2, "# Hi!hi hi!hi");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi");
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("......!ih!ih!ih!i", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......!ih!ih!ih!i" + "'", str2, "......!ih!ih!ih!i");
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                 444!   ", "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                   4444444444444444444444444444444444444444444444HI!HI!...                    " + "'", str2, "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    ...!IH!IH4444444444444444444444444444444444444444444444                   ..." + "'", str1, "                    ...!IH!IH4444444444444444444444444444444444444444444444                   ...");
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                        IH!IH#############################################                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray7, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!H...", "hI!                               ", 71);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "                 444!   ");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444444444444!   ", strArray12, strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!HI" + "'", str8, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                          !IHHI            " + "'", str11, "                          !IHHI            ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str13, "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str19, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4444444444444444444444444444444!   " + "'", str23, "4444444444444444444444444444444!   ");
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HhI!HI            ", "                                                    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HhI!HI            " });
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                        IH!IH#############################################                       ", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI                           HI!HI            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi            ..." + "'", str1, "hi!hi                           hi!hi            ...");
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           " + "'", str2, "hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ");
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI                         HI!HIHI!HIH################################!HI                           hI!H...", "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", "#######################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("############444HI!4444     ###########################44HI#HI                    ", "!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#### ######hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray14 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444     ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("IH#Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH#Ih" + "'", str1, "IH#Ih");
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###############################################hi#!#hi#                                 ", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################hi#!#hi#                                 " + "'", str3, "###############################################hi#!#hi#                                 ");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             " + "'", str1, "                             ");
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("############ih!ih##################################", "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI" + "'", str2, "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI");
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("H", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!i!!i                           ii!!i            ii!i!!i                           ii!!i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("444hi!4444", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "", "", "                           ", "", "", "", "", "            ", "", "", "", "", "", "", "                           ", "", "", "", "", "" });
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           HI!HI                           H################################", 281, "###############################################..##..#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################" + "'", str3, "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################");
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                           HI!HI                           H###############################", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("H         H         H         H                    H         H         H         H", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################" + "'", str3, "###################");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "H         H         H         H                    H         H         H         H" + "'", str8, "H         H         H         H                    H         H         H         H");
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("IH!IH#############################################", "4            4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH#############################################" + "'", str2, "IH!IH#############################################");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                              HI#HI                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", "...44444444444444444HIHi!hiHi!h...");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" });
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!                               ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("IH!IH!IH!IH", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H.." + "'", str1, "I!HI                           hI!HI            hiHI!HI                           hI!H..");
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!II");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                                " });
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!h", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!h" + "'", str2, "hi!h");
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444                                           4444444444", 162, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444                                           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444                                           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#################################i!!                               #################################", "hi#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hi" + "'", str2, "hi#hi");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", "...hhi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI" + "'", str2, "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         H         H         H         H                    H         H         H         H      ", 82, "                       A#############################################AHIA!AHIA                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H                    H         H         H         H      " + "'", str3, "         H         H         H         H                    H         H         H         H      ");
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##                                                                                                                                                             ", "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##                                                                                                                                                             " + "'", str2, "##                                                                                                                                                             ");
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####", ' ', 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI!HI!HI!HI!HI!HI!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!i!i", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i" + "'", str2, "!i!i");
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                  ########                  ########", "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############", 51, 261);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############" + "'", str4, "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi", "               ", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi" });
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!i!i                                                                                                                                                                                                                                        ", 54, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i                                                                                                                                                                                                                                        " + "'", str3, "!i!i                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!HI                           hI!HI             hi", 96, "HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H" + "'", str3, "hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H");
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi", "#############################################hi!hi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI!HI                           hI!HI                           h################################", (int) (byte) 0, 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                  ###############################################HI#!#HI#                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi" });
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################" });
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#############################################HI!HI!##############################################", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "       4444444444HI!HI!...        ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444!", "", "", "hi!hihi!hih################################h" });
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH!IH##################################", 17, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH##################################" + "'", str3, "IH!IH##################################");
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 " + "'", str1, "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                 ih!ih     H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 ih!ih     H " + "'", str1, "                 ih!ih     H ");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                           HI!HI                           H################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIH################################" + "'", str2, "HI!HIH################################");
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       4444444444HI!HI!...        ", "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444HI!HI!...        " + "'", str2, "4444444444HI!HI!...        ");
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("i!hiHi!hiH################################", "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!H..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...4444444444444444 hI!HI", "4444444                   4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                            h          ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...# #444444444444...aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...# #444444444444...aaaaaaaaaaaa" + "'", str1, "...# #444444444444...aaaaaaaaaaaa");
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                          hI!HI               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                     hi!hi", (java.lang.CharSequence) "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############", "I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str1, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("         H         H         H         H        HI!         H         H         H         H         ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!    ", strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray15, strArray18);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray18, strArray21);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi                           hi!hi            hihi!hi                           hi!hi", strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444!   ", strArray8, strArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("i!hiHi!hiH################################", strArray2, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 9 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "H", "H", "H", "HI!", "H", "H", "H", "H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHI!HHHH" + "'", str3, "HHHHHI!HHHH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hI!HI" + "'", str19, "hI!HI");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                          !IHHI            " + "'", str22, "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "444!   " + "'", str24, "444!   ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str26, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI", "                                                            444!                                ", 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "hi", "hi", "", "", "", "", "hi", "hi", "", "", "", "", "hi", "hi", "", "", "hI", "HI" });
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#################44HI444", "                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("IH!IH###################################", "HI!HI                           hI!HI            ...", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH###################################" + "'", str3, "IH!IH###################################");
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###################################################", "                                      H    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!HI                           HI!HI            ...", "hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           HI!HI            ..." + "'", str2, "hI!HI                           HI!HI            ...");
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                            hi!hi", "44hi!hi!44", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  444!       H      H      H      H      ###############################################   hi#hihi#hih################################h", 46, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "          IH!IH                           IH!IHIH            IH!IH  #############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ", 35, "444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           " + "'", str3, "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ");
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!HI                           hI!HI                           h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI                           hI!HI                           h" + "'", str1, "!HI                           hI!HI                           h");
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H         H         H         H                    H         H         H         H", "###########################################        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H                    H         H         H         H" + "'", str2, "H         H         H         H                    H         H         H         H");
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!", "...# #444444444444...aaaaaaaaaaaa", "            HIHI!HI                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!" + "'", str3, "IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!");
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................" + "'", str3, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH", "hi!hihi!hihihi!hihi!hi444HI!H444hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444" + "'", str1, "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 92, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   hiHI!HI                           hI!HI          ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hiHI!HI###########################hI!HI##########" + "'", str3, "###hiHI!HI###########################hI!HI##########");
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  4444444444444444444", "##############################i!!                               #################################", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444" });
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("             ", "hi!HI!HI!HI!HI!                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444", 174);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444" + "'", str2, "  AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI#################################hi!hi", "###################################HI!HI################", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hhi!hihi!hih################################    ", 41, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhi!hihi!hih################################    " + "'", str3, "Hhi!hihi!hih################################    ");
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str1, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444444444444444444hI!HI", "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "###############################################HI################################################", "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444HI!HI!...", "            ######################", "#############################################HI!HI!##########################################...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!##");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!##" });
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##################################", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         h", "                            IH!I", "i!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         h" + "'", str3, "         h");
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 260, (int) (byte) 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###################################HI!HI################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################hi!hi################" + "'", str1, "###################################hi!hi################");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih###################################", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "############", "", "", "", "", "###################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", 21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI", "h", "hI", "HI", "IH", "IH", "hiHI", "HI", "hI", "HI" });
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("            #####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            #####################" + "'", str1, "            #####################");
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "hi!hihi!hih44444444444444444444444444444444", "", 324);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         H         H         H         H        HI!         H         H         H         H         ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        HI!         H         H         H         H         " + "'", str3, "         H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h################################ hi#hi hi#hi", "...######                   I!                        ...######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...######                   I!                        ...######" + "'", str2, "...######                   I!                        ...######");
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                  ", "    #HI   Hi!hiHi!hiH", "HI                           hI!HI            hiHI!HI     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444hI!HI                           hI!HI                           hI!HI                        ", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "!", "                           h", "!", "                           h", "!", "                        " });
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...###################################hi#!#hi", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###################################hi#!#hi" + "'", str2, "...###################################hi#!#hi");
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                        hI!HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                     ", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           IH!Ih                           IH!IHih            IH!Ih                           IH!IH", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444!       H      H      H      H   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444                         aaaaaaa     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           " });
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("            ######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            ######################" + "'", str1, "            ######################");
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h h h h h h h h h h h h", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h################################ hi#hi hi#hi", "aaaaaaa                         aaaaaaa", "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h#################################hi#hi#hi#hi" + "'", str3, "h#################################hi#hi#hi#hi");
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##############################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################" + "'", str2, "##############################################");
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################################", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################################" + "'", str4, "#####################################");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "###############################################hi#!#hi#                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hI!HI                           hI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("###############################################hi#!#hi##############################################", "!HI                           hI!HI  444   4444hI!HI                           hI!HI", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa" + "'", str2, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa");
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############################################################################################hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih##############################################################################################" + "'", str1, "!ih!ih##############################################################################################");
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "H!IH", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     ", "  hiHI!HI ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
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
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!H..", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!", 34, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("############4444444444444444444444444444444444444444444444!hi!hihi!hi", "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!HI!HI!HI!HI!", "aaaaaaaaaaaaaaaaaaaaaaaahi!hi#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", 162);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!HI!HI!HI!HI!" });
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 61);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", "IH!IH##################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h", "h", "h", "h", "h", "h", "hi", "hhhhhhhhhhhhhhhhhhhhhhhhi", "hhhhhhhhhhhhhhhhhhhhhhhhi", "hhhhhh" });
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("         h         h         h         h        hi!         h         h         h         h         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h         h         h         h        hi!         h         h         h         h" + "'", str1, "h         h         h         h        hi!         h         h         h         h");
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "44H4H44H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                     hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("               ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...###################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        char[] charArray9 = new char[] { 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!#######", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!HI                            ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444HI!H444      ", "hiHI!HI                           hI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444      " + "'", str2, "444HI!H444      ");
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                444!       H      H      H      H   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!       H      H      H      H" + "'", str1, "444!       H      H      H      H");
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("H         H         H         H        HI!         H         H         H         H         ", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H        HI!         H         H         H         H         " + "'", str2, "H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA", "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA" });
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hihi!hihihi!hihi!hi444HI!H444hi!hihi!hihihi!hihi!hi", "HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaahi!hihi!hihihi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaahi!hihi!hihihi!h" + "'", str1, "aaaaaaaaaahi!hihi!hihihi!h");
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("##############     4444!ih444##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############     4444!IH444##############" + "'", str1, "##############     4444!IH444##############");
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI#HI", "hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#hi!hi#hihihi#", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ", "                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("################################..", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################.." + "'", str2, "################################..");
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "I", "!", "HI", "                           ", "h", "I", "!", "HI", "  ", "444", "   ", "4444", "h", "I", "!", "HI", "                           ", "h", "I", "!", "HI", "  " });
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("       H         H", "hi#hhi   hi!hihi!hih################################", 393);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       H         H" + "'", str3, "       H         H");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                     I  I                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     I  I                   " + "'", str1, "                     I  I                   ");
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!    ", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray11, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray14, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi                           hi!hi            hihi!hi                           hi!hi", strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444!   ", strArray4, strArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!HI" + "'", str15, "hI!HI");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                          !IHHI            " + "'", str18, "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "444!   " + "'", str20, "444!   ");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str23, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIH44444444444444444444444444444444" + "'", str1, "HI!HIHI!HIH44444444444444444444444444444444");
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" });
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                44HI!HI!4444HI!HI!4444HI!HI!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                44HI!HI!4444HI!HI!4444HI!HI!44" + "'", str1, "                44HI!HI!4444HI!HI!4444HI!HI!44");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HI!HI!H", "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################", 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!H" + "'", str3, "HI!HI!HI!H");
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "4444444444HI!HI!...                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!  !   hi!hihi!hih################################hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!  !   hi!hihi!hih################################hi" + "'", str2, "!  !   hi!hihi!hih################################hi");
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################" + "'", str1, "#####################################");
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444###############...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#hi!hi#hihihi#", 126, "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa" + "'", str3, "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa");
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "!IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                   ", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                " + "'", str2, "                                                ");
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "i!hihi!hii!hihi!hii!hihi!hii4444444444444444444444444444444444444444444i!hihi!hii!hihi!hii!hihi!hii!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...44444444444444444HIHi!hiHi!h...", "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "HIH", "H", "..." });
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("     4444444444444444444444444444444444444444444444", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444                                                                                                                                                                                          " + "'", str2, "     4444444444444444444444444444444444444444444444                                                                                                                                                                                          ");
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          ", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 42, "ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi" + "'", str3, "ih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi");
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                           hI!HI            hiHI!HI                           hI!HI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           Hi!hi            HIhi!hi                           Hi!hi             " + "'", str1, "                           Hi!hi            HIhi!hi                           Hi!hi             ");
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" ", "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih" + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HI!HI!", "hi!", 0);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 92 + "'", int6 == 92);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  " + "'", str1, "                  ");
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("     ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray4, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              hI!HIhI!HIh################################", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!HI" + "'", str8, "hI!HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                              hI!HIhI!HIh################################" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!hi!" });
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                            #####hi!hi                                                                                                                                                                                             ", (java.lang.CharSequence) "I!HI                                       hiHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 346 + "'", int2 == 346);
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                             I!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             i!                                             " + "'", str1, "                                             i!                                             ");
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ################################        ", "  4444444444444444444444444444444444444444444444!   ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       ################################        " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", 39, 136);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAA");
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                hi                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!iH                           ih!ihIH            ih!i", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!iH                           ih!ihIH            ih!i" });
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
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
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "                        hI!HI  ", 0, 85);
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
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...4444444444444444 hI!HI", 174);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i", "i", "i", "i", "i", "i", "i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                      444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 I!                                                                                                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                      ", "444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", 29, "hI   Hi!hiHi!hiH               Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str3, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "      H         H         H         H         !ih        H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!4444444444444444444444444444444444444444444444", "HI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", 126);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" + "'", str2, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI!IIhI!IIh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IIhI!IIh" + "'", str1, "HI!IIhI!IIh");
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI ! HI ! HI ! HI" + "'", str3, "HI ! HI ! HI ! HI");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Ih!iHi!444Ih!iH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("     4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("           H44H4h44H4hiH44H4h44H4H44H", 62, "4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H" + "'", str3, "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H");
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################", "!ihhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############", "!44...", "hi#hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############" + "'", str3, "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############");
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!", "I!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!" + "'", str2, "hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!");
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hI!HI                           ", "           hi!hiHi!hiHIhi!hiHi!hihi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           " + "'", str2, "hI!HI                           ");
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", "!I!I", "  hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i" + "'", str3, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                            h          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            h          " + "'", str1, "                            h          ");
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi! HI!HI                           hI!HI            hiHI!HI       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################", "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################" + "'", str2, "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################");
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    H     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...######################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ihhhI!                 ", "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhhI!                 " + "'", str2, "!ihhhI!                 ");
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!I                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###", "", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###" });
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", "", 277);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI" + "'", str7, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI");
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray7, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("I!    ", strArray7);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, '4');
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray20, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray15, strArray20);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#############################################HI!HI!#############################################", strArray7, strArray15);
        int int30 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean31 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                    HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH                                                                                                                                                                                                                                                                                                                                                                    ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " " + "'", str11, " ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "IH!IH#############################################" + "'", str26, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str27, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!hiHi!hiH########################" + "'", str28, "Hi!hiHi!hiH########################");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#############################################HI!HI!#############################################" + "'", str29, "#############################################HI!HI!#############################################");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI                           HI!HI            ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "                           ", "HI", "!", "HI", "            ", "..." });
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HIHI!HIH################################", "                   4444444                   4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444!   ", "                       #############################################HI!HI                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##                                                                                                                                                             ", "                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##" });
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("################################...######################################################", "############...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("             hI!HI             hi", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!HI", "###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               4               ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444..." + "'", str1, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAihAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAihAAA" + "'", str1, "aAAAAihAAA");
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444 hI!HI", "HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444 hI!HI" + "'", str2, "4444444444444444444444444444444444444444444444 hI!HI");
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!II", "ih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi", 39, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!IIih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi" + "'", str4, "aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!IIih!ihih!ihih!ihih!ihiih!ihih!ihih!ihih!ihi");
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                hi                 ", "aaa!ih!ih", "I!HI!HI!HI!HI!H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HIhI!HIh################################", "           hI!HI   ", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ", ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hiHi!hiHIhi!hiHi!h", "  #########", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("################################...######################################################", "...#####################################################", 236);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                               ", "HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI                           hI!HI            hiHI!HI                           hI!HI", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  hI!HI" + "'", str2, "                  hI!HI");
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!hihi!hi", "                       hiHI!HI              ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", "                          hI!HI               ", "4444!ih444                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi" + "'", str3, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                              " + "'", str1, "i!                              ");
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!", "444444444                                           4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!" + "'", str2, "IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!");
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!hiHi!hiH################################", "444hi!4444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 105, 17);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "H################################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##!ih", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####..." + "'", str1, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...######                   I!                        ...######", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "ih!ihih!ih");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#HI", strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                   ", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 44 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih!iH                           ih!ihIH            ih!iH                           ih!ih", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hiHi!hi");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "4444444                   4444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hiHi!hi" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hiHi!hi" + "'", str4, "Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!hiHi!hi" + "'", str5, "Hi!hiHi!hi");
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!                                                                                                 ", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!aa", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh", "###hiHI!HI###########################hI!HI##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "        444hi!4444              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HIhI!HIhiHI!HIhI!HIHI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    H     hi!hi                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI", "##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa" });
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("          ", "hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  " + "'", str2, "hi!  ");
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!4444     ", "#########                                              hI!HIhI!HIh################################", "I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444     " + "'", str3, "hi!4444     ");
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("###############################################", "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH", 44, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########################                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH###" + "'", str4, "###########################                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH###");
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "hi!", (int) (short) 10);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("###############################################hi#!#hi#                                 ", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444!   ", "hi", "hih################################hi" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         ", (java.lang.CharSequence) "!IHHI");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         " + "'", charSequence2, "                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         ");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI#HI");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("HI#HI", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hiHi!hiH################################", strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("HI   HI!HIHI!HIH################################    ", strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "                                                                                                 ");
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray15, strArray21);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                              ", strArray8, strArray21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "#", "HI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI#HI" + "'", str9, "HI#HI");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                                                                                                                                                                              " + "'", str25, "                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "HI!HI                           hI!HI            ...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi                           hi!hi            hihi!hi                        ..." + "'", str2, "Hi!hi                           hi!hi            hihi!hi                        ...");
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hihi!hih################################", "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!hi!hi                           Hi!hi            HIhi!hi              ", 61, "!HIHI!HIH##############...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi              " + "'", str3, "!hi!hi                           Hi!hi            HIhi!hi              ");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                       A#############################################AHIA!AHIA                        ", 8, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...               A#############################################AHIA!AHIA            ..." + "'", str3, "...               A#############################################AHIA!AHIA            ...");
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                  ########                  ########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444hi!4444444444444444444444444", "####################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444hi!4444444444444444444444444" });
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str4, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...################HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...################H" + "'", str1, "...################H");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("I!HI                           hI!HI                           h################################", "aaaaaaa", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi                           hi!hi                           h################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str2, "I!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }
}

