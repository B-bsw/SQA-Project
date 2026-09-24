package org.apache.commons.lang3;

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
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", (java.lang.CharSequence) "hi!IHAA", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                             4", "               a hi!        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             4" + "'", str2, "                                                                                             4");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAHI", "A hi!!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IHAA" + "'", str1, "HI!IHAA");
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", 31, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###" + "'", str3, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "               A                ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                     aahi!                                                     ", '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi######", strArray7, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                                     aahi!                                                     " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aahi######" + "'", str11, "aahi######");
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi4   a  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AHi############", "       A                                          ", "4444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "4444444444444444444444444444444", 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "A                                  ", (int) (short) 100, 119);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "4" });
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444444444444444444444444AAHI444444444444444444444444", "##########################################A##########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                    #######...", (int) (byte) 10, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    #######..." + "'", str3, "                                                                                    #######...");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("               #######...A#######...                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######...A#######..." + "'", str1, "#######...A#######...");
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                             A HI                                                                                                                                                              ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "               A                ", (java.lang.CharSequence) "##", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("A hi", "A hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hi" + "'", str2, "A hi");
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", "                                                                                                                                                             a hi                                                                                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4" + "'", str4, "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#######################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", (java.lang.CharSequence) "a##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 767 + "'", int1 == 767);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########################################A##########################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########################################A##########################################" });
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "               a hi!        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########################################A##########################################", "  aahi4   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################A##########################################" });
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                         ######################################################################", 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              " + "'", str2, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "i", (java.lang.CharSequence) "#####################################################ahi###############################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (java.lang.CharSequence) "aahiaahia!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a##########", "", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a##########" + "'", str4, "a##########");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                a           ", 767);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "               A                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                " + "'", str1, "!ih                                                                                                ");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", (int) (byte) 1, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                            a  aahi4", "       A                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih", "                                  A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("       A                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       A                                          " + "'", str1, "       A                                          ");
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HI!IHAA", (java.lang.CharSequence) "                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) " ", "aahi######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                   ", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 969);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!IHAA", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!IHAA" + "'", str2, "HI!IHAA");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HICLASS...", (java.lang.CharSequence) "#...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HICLASS..." + "'", charSequence2, "HICLASS...");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                 hi!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 hi!IHAA" + "'", str1, "                                                                                                 hi!IHAA");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "A hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahi##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "aahia##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A hi", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a#hi!!ih#################################################################################################", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                         ######################################################################", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ######################################################################" + "'", str3, "                                         ######################################################################");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "                                                                                                    aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                    #######...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                             4", "4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             4" + "'", str2, "                                                                                             4");
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                    #######...", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "a##########", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aahi######", 78, "!ih                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######!ih                                                                 " + "'", str3, "aahi######!ih                                                                 ");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("A", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A              " + "'", str2, "A              ");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ahi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI       " + "'", str1, "AHI       ");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a#hi!!ih#################################################################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str2, "a#hi!!ih#################################################################################################");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaa####################", "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa####################" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa####################");
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("               A HI!               ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               A HI!               " + "'", str2, "               A HI!               ");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                !IH                                                                              ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!        ...", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######...A#######...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray2, strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "       A                                  ", "       " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str6, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "aahi!" });
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                      ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("A hi!!ih", "a4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4hi!" + "'", str2, "a4hi!");
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi4                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str1, "a#hi!!ih#################################################################################################");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    aahi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, (java.lang.CharSequence) "AHi       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ih A", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aahi4!", "!IH", "a hi!!ih                                                                                                                   AAHI!                                                     ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi4!" + "'", str4, "aahi4!");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a4hi!", "hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a4!" + "'", str3, "a4!");
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "                                  A", (int) '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str5, "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaa", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(charSequence0, charSequence1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                    aaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", (java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahi######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AHI       ", "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI       " + "'", str2, "AHI       ");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aahia!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!" + "'", str2, "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                a           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str2, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 a                                                  ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "              Hi!               ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 969, (int) (short) 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aahi######ahi##########ahi##########ahi##########ahi", "A              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######ahi##########ahi##########ahi##########ahi" + "'", str2, "aahi######ahi##########ahi##########ahi##########ahi");
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("    ", 10, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa    " + "'", str3, "aaaaaa    ");
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "A hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aahi", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi" + "'", str3, "aahi");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a hi!", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a hi!     " + "'", str3, "a hi!     ");
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                  ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 a  aahi4", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) " #..                                                 a  aahi4", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A                                  ", (java.lang.CharSequence) "                        ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahi4!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 15, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                     AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                !IH                                                                              ", (java.lang.CharSequence) "         4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "              Hi!               ", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "         4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    " + "'", str5, "    ");
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                    #######...", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    #######..." + "'", str2, "                                                                                    #######...");
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444AAHI444444444444444444444444", 0, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str3, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a hi!!ih                                                                                                 ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "A hi!!ih", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaa", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "A hi!!ih                                                                                                 ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) 'a', 93);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("######################################################################", "!ih                                                                                                ", (int) '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                        ", strArray3, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "h", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "######################################################################" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "######################################################################" + "'", str13, "######################################################################");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                          ", (java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ahi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI       " + "'", str1, "AHI       ");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(charSequence0, (java.lang.CharSequence) "##########                        ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!     " + "'", str1, "A HI!     ");
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "ahi!aaahi!a", (java.lang.CharSequence) "                a           ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "4");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence1, (java.lang.CharSequence[]) strArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                !ih", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  AAHI4   ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  AAHI4   " + "'", str3, "  AAHI4   ");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                  A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;", "444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ahi!aaahi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("ih A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih A" + "'", str1, "ih A");
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AHi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHi       " + "'", str1, "aHi       ");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "                                                 a                                                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str1, "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                !ih", (java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI##########", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                             ", "                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AHi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aahi#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi#####" + "'", str1, "aahi#####");
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("ahi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi       " + "'", str1, "ahi       ");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################" + "'", str1, "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                        ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaahiaaaaaaaaaaaaaaaaa", 119, "hi!IHAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I" + "'", str3, "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I");
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aahi######", "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", "#a#");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########", "aahi4", 31);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ahi       ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi       " + "'", str2, "ahi       ");
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!" + "'", str1, "aahi!");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaahiaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaahiaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaahiaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ", 97, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 " + "'", str3, "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A              ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaa");
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i", 24, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHi" + "'", str1, "aHi");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aahia##########", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("##########                        ", "AAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                   ", "aahi4!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################################################################################################################################################################################################################################################################################################################", "       hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "################################################################################################################################################################################################################################################################################################################################" + "'", str6, "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a hi!", 767);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!" + "'", str2, "a hi!");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "...##########################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a4hi!", 55, "##########                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                        ##########      a4hi!" + "'", str3, "##########                        ##########      a4hi!");
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                a               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                           ##########                                            ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "AHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                !IH                                                                              ", "aahia!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !IH                                                                              " + "'", str2, "                !IH                                                                              ");
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("              Hi!               ", 319);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str2, "                                                                                                                                                             Hi!                                                                                                                                                               ");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ", "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", "a hi!", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#" });
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", str2, ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hhhhhhhhhhhhhhhhhhhhhhhh", "hi4", "##########                                            444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                              hi!                ", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    hi!                " + "'", str2, "                                    hi!                ");
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aahia##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaa", "a hi!!ih                                                                                                                   AAHI!                                                     ", "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhh" + "'", str3, "hhhhhh");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                               ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi4", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4" + "'", str3, "hi4");
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            a  aahi4", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("    ", "aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                           ##########                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           ##########                                            " + "'", str1, "                                           ##########                                            ");
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aahi######ahi##########ahi##########ahi##########ahi", 104, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "               a hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444               A               444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444", "               ", "A", "               ", "444444" });
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi4", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4" + "'", str3, "hi4");
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HICLASS...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "  aahi4   ", 319);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                              ", 99, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi##########", "                                                     AAHI!                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi##########" });
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aahiaahia!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa####################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", "Aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih                                                                                                 ", "!IHAA", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aih                                                                                                 " + "'", str3, "aih                                                                                                 ");
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########                                            444444444444444444444444", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                            444444444444444444444444" + "'", str3, "##########                                            444444444444444444444444");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 100, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "##########                        ", (java.lang.CharSequence) "    aahi4!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aahia##########", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HICLASS...", (java.lang.CharSequence) "AAHI!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence) "                                           ##########                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##", (java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 78, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...               4.STRING;C..." + "'", str3, "...               4.STRING;C...");
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                    #######...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    #######..." + "'", str2, "                                                                                    #######...");
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi", (java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "A", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#A#" + "'", str9, "#A#");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("          ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "######################################################################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!IHAA", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!IHAA" + "'", str3, "HI!IHAA");
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################################################################################################################################################################################################################################################################################################" + "'", str1, "################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  ... ", 97, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... " + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#####################################################ahi###############################################################", "aahi##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "AAHI##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                !IH                                                                              " + "'", str1, "                !IH                                                                              ");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a hi!!ih                                                                                                 ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                a                  ", " ##        Hi!               ", "...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444               A               444444" + "'", str1, "44444               A               444444");
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "Hi", (java.lang.CharSequence) "ahi##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AHI       ", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 56, 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str4, "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444AAHI444444444444444444444444", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str2, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi4   a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4   a  " + "'", str1, "hi4   a  ");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "    aahi4!", (java.lang.CharSequence) "                !ih               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A             " + "'", str1, "A             ");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ih A", "a hi!     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aih                                                                                                 ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                 hi!IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aahi4!", 78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", str1, "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a hi!!ih                                                                                                 ", (java.lang.CharSequence) "ahi##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "H", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", "               A                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AHi############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("ahi!aaahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!aaahi!a" + "'", str1, "ahi!aaahi!a");
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "                              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", charSequence2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "     hi!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...##########################...", "4444444444444444444444444444444", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...##########################..." });
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AHI       ", "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI       " + "'", str3, "AHI       ");
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#####################################################ahi###############################################################", "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################ahi###############################################################" + "'", str2, "#####################################################ahi###############################################################");
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                a           ", (java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                a           " + "'", charSequence2, "                a           ");
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a##########", "aahi######!ih                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                             A HI                                                                                                                                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "                      ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                !ih               ", (java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                     !ihaa                                                     ", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     !ihaa                                                     " + "'", str2, "                                                     !ihaa                                                     ");
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("a4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4hi!" + "'", str1, "a4hi!");
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!!ih                                                                                                                   AAHI!" + "'", str1, "a hi!!ih                                                                                                                   AAHI!");
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##########", "##########                        ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4!" + "'", str1, "a4!");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                     !ihaa                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "                                                     AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("  aahi4   ", "                                                                                             4", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aahi4   " + "'", str3, "  aahi4   ");
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", 111);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a#hi!!ih#################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str2, "a#hi!!ih#################################################################################################");
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!IH", "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         aaaaaaaaaaaaaaaaaaaaaaa", "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                         aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi4!", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (short) -1, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi4!" });
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "               A                ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "               a                ", 0, 638);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "  ", (java.lang.CharSequence) "                                                     !ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "!IH", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" #..                                                 a  aahi4", "                                                 a                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a#hi!!ih################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!IHAA", 29, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 969);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#########", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           #########            " + "'", str2, "           #########            ");
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                        ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str1, "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", 93, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... [LJAVA.L..." + "'", str3, "... [LJAVA.L...");
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", (java.lang.CharSequence) "aahiaahia!!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Threshold must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "a hi", (java.lang.CharSequence) "aahia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 32, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AHi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi" + "'", str2, "AHi");
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aahi######!ih                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                 " + "'", str2, "aahi######!ih                                                                 ");
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi" + "'", str1, "A hi");
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "     hi!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", "                                           ##########                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAHI##########", "               A HI!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI##########" + "'", str2, "AAHI##########");
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  AAHI4   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("       hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       #hi#!" + "'", str3, "       #hi#!");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                              ", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           #########            ", "aahi######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                     !ihaa                                                     ", "  AAHI4   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaa                                                     " + "'", str2, "!ihaa                                                     ");
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!IH                                                                                                 ", (java.lang.CharSequence) "A hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#######...", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#######..." });
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                          ", "#######...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("a4hi!", "AHI       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4hi!" + "'", str2, "a4hi!");
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               #######...A#######...                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "               ", "#######...", "A", "#######...", "                " });
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "aaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      " });
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ihaa                                                     ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaa                                                     " + "'", str2, "!ihaa                                                     ");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                          ", 34, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str1, "a#hi!!ih#################################################################################################");
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#######################################################################################       hi!", 29, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH                                                                                                 ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH                                                                                                 " });
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" #... ", 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               #... " + "'", str3, "                                                                                               #... ");
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "", (java.lang.CharSequence) "hi##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#######...A#######...", (java.lang.CharSequence) "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = new char[] { '#', '#' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahi######", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle(" ", "", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AHi       ", 638);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi       " + "'", str2, "AHi       ");
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                      ##########", (java.lang.CharSequence) "aahia##########", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhh" + "'", str1, "hhhhhh");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "     hi!                ", (java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ", "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "A hi", (java.lang.CharSequence) "aaaaaaaaaaaaaa", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4" + "'", str1, "HI4");
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(charSequence0, (java.lang.CharSequence) "44444               A               444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    " + "'", str1, "    ");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("     hi!                ", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     h!                " + "'", str2, "     h!                ");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##########", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########" + "'", str3, "##########");
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                     AAHI!                                                     ", "...##########################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     AAHI!                                                     " + "'", str2, "                                                     AAHI!                                                     ");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "A hi", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                                 hi!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ", (java.lang.CharSequence) "Aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 180 + "'", int2 == 180);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "A hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("A              ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    A              " + "'", str2, "                    A              ");
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "               A                ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                 a                                                  ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 a                                                  " + "'", str2, "                                                 a                                                  ");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#######...A#######...", (int) (byte) 100, 319);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 319, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str3, "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                    hi!                ", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                    A              ", "aahi##########", "Aahi!", 969);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                    A              " + "'", str4, "                    A              ");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                !ih               ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih               " + "'", str2, "                !ih               ");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#####################################################ahi###############################################################", "ahi##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################ahi###############################################################" + "'", str2, "#####################################################ahi###############################################################");
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                             a hi                                                                                                                                                              ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             a hi                                                                                                                                                              " + "'", str2, "                                                                                                                                                             a hi                                                                                                                                                              ");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aahi4!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    aahi4!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ahi       ", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##########                        ##########      a4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                             4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" #..                                                 a  aahi4", "", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #..                                                 a  aahi4 #..                                                 a  aahi4" + "'", str3, " #..                                                 a  aahi4 #..                                                 a  aahi4");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ", "                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ##########" + "'", str2, "  ##########");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               #######...A#######...                ", (java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a##########");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "               A                ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "                                           ##########                                            ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!", strArray7, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a hi!!ih                                                                                                                   AAHI!                                                     ", strArray2, strArray13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a##########" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!" + "'", str14, "Hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "a hi!!ih                                                                                                                   AAHI!                                                     " + "'", str15, "a hi!!ih                                                                                                                   AAHI!                                                     ");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "!IH", (java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "A HI!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi4", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4" + "'", str2, "aahi4");
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!IHAA", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HICLASS...", "######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HICLASS..." + "'", str2, "HICLASS...");
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    ", "                                !ih", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    " });
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######..." + "'", str1, "#######...");
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                             a hi                                                                                                                                                              ", "    aahi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aahi##########", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi##########" + "'", str2, "aahi##########");
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                !ih               ", "HI!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih               " + "'", str2, "                !ih               ");
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aHi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHi" + "'", str1, "aHi");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "a##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaa####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA####################" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA####################");
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aahia!", "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia!" + "'", str2, "aahia!");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("              Hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              hI!               " + "'", str1, "              hI!               ");
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                              hi!                ", 6, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              hi!                " + "'", str3, "                                                                              hi!                ");
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                !ih               ", "H", "                                                                                                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#a#", 42, "AHi       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi       AHi      #a#AHi       AHi       " + "'", str3, "AHi       AHi      #a#AHi       AHi       ");
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "#######################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" });
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...", 42, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("A                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A                                  " + "'", str1, "A                                  ");
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("A hi", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi" + "'", str2, "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aahi4", 9, 767);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("a hi!     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!" + "'", str2, "aahi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                    aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    aaaaaaaaaaa" + "'", str1, "                                                                                                    aaaaaaaaaaa");
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4" + "'", str1, "hi4");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444", (java.lang.CharSequence) "AHI       ", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aahi4", 56, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi4444444444444444444444444444444444444444444444444444" + "'", str3, "aahi4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "!ihaa                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("               A HI!               ", "aaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               A HI!               " + "'", str3, "               A HI!               ");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                              hi!                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) 'a', 2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "AHI       ", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", 111, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String[] strArray6 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) (byte) 10, 78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "A hi", 3, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "               A               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        java.lang.String[] strArray9 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "a");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray9, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence[]) strArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str1, "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

