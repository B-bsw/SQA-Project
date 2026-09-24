package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ih", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih" + "'", str2, "aahi######!ih");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a4a", "####################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a4a" });
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH", "                                         ######################################################################                                         ##############     h!                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "HI", 64);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "##hi#aaaaaaaaaa                   ", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ahi", 757, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aahi######!ih", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih" + "'", str2, "aahi######!ih");
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...       aaaaaaaaaaaaaa...", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...       aaaaaaaaaaaaaa..." });
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A HI!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "a" + "'", str10, "a");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", "AAHI!ih                                                                                                 ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("aahi######ahi##########ahi##########ahi##########ahi", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aahi######ahi##########ahi##########ahi##########ahi" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH" + "'", str7, "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" });
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AHI        ", (java.lang.CharSequence) "44444               A               444444", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4ihaa  a", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4ihaa  a" + "'", str2, "4ihaa  a");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...    ...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ############################################               A               ############################################                 ", (int) (short) 100, 6);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "    ", "..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("..                                                 a  aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..                                                 A  AAHI4" + "'", str1, "..                                                 A  AAHI4");
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################aaaaaaaaaaaaa" + "'", str1, "#################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aahiaah                 hi          !aahiaah", "", "aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aahi4!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    aahi4!");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 18, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                         hi!##########444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!##########444444444444444444444444" });
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          Hi!          ...44444444444444444 ##        Hi!", 111, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                              ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4');
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a hi!!ih", strArray2, strArray6);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a hi!!ih" + "'", str12, "a hi!!ih");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444444444444444444444444444444444444", "aahi4444444444444444444444444444444444444444444444444444", 201, 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444aahi4444444444444444444444444444444444444444444444444444" + "'", str4, "44444444444aahi4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A", (java.lang.CharSequence) "######################################################444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("               a hi!               ", "A HI!!IH                                                                                                                   AAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!               " + "'", str2, "a hi!               ");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                 AHI##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI##########" + "'", str1, "AHI##########");
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "", 524);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " });
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "IH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.4                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hhhhhhhhhhhhhhhhhhhhhhhh", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;" + "'", str1, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaa################################################################", 18, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa################################################################" + "'", str3, "aaaaaaaaaaaaa################################################################");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi", "4" });
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a", "aahiaah                 hi          !aahiaah", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a" + "'", str3, " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "!ih a                                                                                                                                                                                             IH A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...            a4!...            ", 193, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...            a4!...                                                                                                                                                                            " + "'", str3, "...            a4!...                                                                                                                                                                            ");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "  ...                                                                              ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAaahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH", "AAHIaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH" });
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        char[] charArray6 = new char[] { ' ', '4', 'a', 'a' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a", (java.lang.CharSequence) "                                                                                                          aAHI!i                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "A               A               A          ##hi#aaaaaaaaaA               A               A          ", (java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "A HI!!IH                                                         ...", (java.lang.CharSequence) "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (java.lang.CharSequence) "!ih !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class" });
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                           aaaaaaaaaaaaaa aaaaaaaaaaaaaa                                                                            ", (java.lang.CharSequence) "#aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi######!ih", "...##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi", "!ih" });
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("              hi!              ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              hi!              " + "'", str2, "              hi!              ");
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", "AAHI!ih                                                                                                 ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aahi#...", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aahi#..." + "'", str9, "aahi#...");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...##########", 111, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################...###########################################################" + "'", str3, "#################################################...###########################################################");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" ##        HI!               ", "                                                                                                                   a hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ##        HI!               " + "'", str2, " ##        HI!               ");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...", "#####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!..." + "'", str2, "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "      4               a               4               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                           A HI!        ...", "       A                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!", "..." });
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        java.lang.String[] strArray10 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "a");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray10, strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "##########", (int) ' ', (int) (short) 1);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi!", (java.lang.CharSequence[]) strArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", (java.lang.CharSequence[]) strArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence[]) strArray14);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#######################################################################################################################                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################################################################" + "'", str1, "#######################################################################################################################");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", (java.lang.CharSequence) "##hi#aaaaaaaaa", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AHI        ", "#######################################################################################################################                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", (java.lang.CharSequence) "#...", 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                       hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi##########hi####", 111);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4", "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444", "4", 15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "4444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Ahi##########HI!", 223, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa", "#######...A#######...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaa       A", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 151, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "#################################################################aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str2, "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A HI!!IH                                                         ...", 5, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!ih                                                                 ", "hi!ih                                                                 ", "hi!ih                                                                 ", "hi!ih" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!ih", "hi!ih", "hi!ih", "hi!ih" });
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" s ", "                #               ", "Ahi!!ih44444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hhhhhh", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhh" + "'", str2, "hhhhhh");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###AAAAAAAAAAAahi#######AAAAAAAAAAA", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####################aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ", "aaaaaaaaaaaaa################################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 527);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("####aahia##########aahia##########aahia####", "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####aahia##########aahia##########aahia####" + "'", str2, "####aahia##########aahia##########aahia####");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########################################A##########################################", "aahia##########aahia####");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI4", "##H", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI4" + "'", str3, "HI4");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444", "###aaaaaaaaaaaahi#######aaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AHi############", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi############" + "'", str2, "AHi############");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", "AAHI44444444444", "class [L");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!" + "'", str3, "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa                                                     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa                                                     " });
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444s", (java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 249 + "'", int2 == 249);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###aaaaaaaaaaaaaaAAHIaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###", "aaaaaaaaaaaaaa", "AAH", "Iaaaaa", "..." });
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                            ", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) ".class[c#######...class[ljava.lang.string;#######", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ", 151, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     AAHI######!IH                                      ..." + "'", str3, "...     AAHI######!IH                                      ...");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa...                                                     aahi!                                                                                                          aahi!                                                                                                          aahi!          ", (java.lang.CharSequence) "                                                                                                 hi!!ih A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "4a4a4a4a4a4a4a4a4a4a4aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", (java.lang.CharSequence) "ahi!", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################", 246, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########                 ##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################" + "'", str4, "##########                 ##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "s ", (java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi", 110, "aahi######!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######!ihaahi######!ihaahi######!ihaahi######!ihaaahiaahi######!ihaahi######!ihaahi######!ihaahi######!iha" + "'", str3, "aahi######!ihaahi######!ihaahi######!ihaahi######!ihaaahiaahi######!ihaahi######!ihaahi######!ihaahi######!iha");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", "", (-1));
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi#####", 0, (int) (short) 1);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "               a hi!        ...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###444" + "'", str1, "###444");
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               A               ", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aa", "aaaaaaaaaaaaa################################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               A               " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Ahi##########HI!", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ahi##########HI!                                      " + "'", str2, "Ahi##########HI!                                      ");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "#4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!" + "'", str1, "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4     4ih4     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#############################               a hi!               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################               a hi!               " + "'", str2, "#############################               a hi!               ");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("A              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("I", 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                             Hi!                                                                                                                                                               ", strArray10, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...##########################...", strArray10, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 ", strArray2, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "IHA", "Aaaaaaaaaaaaaaa", " " });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str16, "                                                                                                                                                             Hi!                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a" + "'", str22, "a");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "...##########################..." + "'", str24, "...##########################...");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       #HI#!", 246, "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa       #HI#!##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa" + "'", str3, "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa       #HI#!##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                          ", "#######################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                          " + "'", str2, "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                          ");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       a...#######a...#######hi!", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "AAHI!ih                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 167, 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                                                                                Aahi", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaa aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa aaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaa aaaaaaaaaaaaaa");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1), '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H  HH! 4");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAHIAAAAAAAAAAAAA#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########                                                                             ##########", "                                                                                              ", 96);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 928, 111);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########                                                                             ##########" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ", "ihaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A " + "'", str2, "               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########", 83, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########" + "'", str3, "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                !ih           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "  4  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaa          aaaaa", (java.lang.CharSequence) "A              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaa          aaaaa" + "'", charSequence2, "aaaaa          aaaaa");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       " + "'", str2, "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       #                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       #                                          " + "'", str1, "       #                                          ");
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "  hi#...", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ", "       A                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    " + "'", str2, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4!" + "'", str1, "hi4!");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " hi!        ...    a               ", "                                                                                                                                                                                                                                               A HI!        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "  ##########", (java.lang.CharSequence) "                                                                                                 HI!ihaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "...C;GNIRTS.4               ...", (java.lang.CharSequence) "4IHAA", 757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAHI4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4" + "'", str1, "AAHI4");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI                                                                                                                                                                                             A HI!" + "'", str1, "A HI                                                                                                                                                                                             A HI!");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               " });
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...", (java.lang.CharSequence) "a#hi!!ih##...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi##########", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                    #                                                        ", "                                                                      a    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    #                                                        " + "'", str2, "                    #                                                        ");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aAHI######!IH", "AAHI######!IH", "AAHI######!IH", "AAHI######!IH" });
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("s44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "s44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "s44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "", "                                                   aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                                                                                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S", "LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "IH", 44, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                !ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...HI######", "a  aahi4", "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A hi", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                             4", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih                                                                                                 ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                hi!            ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                hi!            " });
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("       ", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAHIAAAAAAAAAAAAA######################################################################", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################" + "'", str2, "#####################################################");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "#######################################################################################       hi!", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                 a                                                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                               ");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "a" + "'", str9, "a");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#################################################################aaaaaaaaaaaa", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "          Hi!          ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4                !IH                                                                              44", (java.lang.CharSequence) "##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "44444 A 444444", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 119 + "'", int3 == 119);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                             Hi!                                                                                                                                                               ", "               4A               4  ", "Hi!IHAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str3, "                                                                                                                                                             Hi!                                                                                                                                                               ");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "i ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                hi!        ...", "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH", 34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                hi!        ..." });
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                      ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("########## 444444444444444444444444", "                                                                                             4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########## 444444444444444444444444" + "'", str2, "########## 444444444444444444444444");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                     ahia a##########                                                                                                                                                   ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("####################                a           ####################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         a  aahi", 103);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################", "####################" });
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###AAAAAAAAAAAAHI#######AAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi##########hi####", (java.lang.CharSequence) "ih A", 312);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                          " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi", "############################################               a               ############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi" + "'", str2, "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...", 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" });
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aIH", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       #hi#!", (java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" A", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " A" + "'", str3, " A");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA", "4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", "I");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#######...", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######..." + "'", str2, "#######...");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("H");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", strArray1, strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str4, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#############################               a hi!               ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               a hi!               " });
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a hi!!ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH", 42, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                aaaaaaaaaaaaaaaaaaaaaaaa            !IH" + "'", str3, "...                aaaaaaaaaaaaaaaaaaaaaaaa            !IH");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A HI!", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAaahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "      ###aaaaaaaaaaaaaaAAHIaaaaa...", 58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 110, 312);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("A hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi!!ih" + "'", str1, "A hi!!ih");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44", (java.lang.CharSequence) "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44" + "'", charSequence2, "44");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                    aaaaaaaaaaa", "                                                     ##########                                                                             ##########                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    aaaaaaaaaaa" + "'", str2, "                                                                                                    aaaaaaaaaaa");
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi4");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "            !ih                                                                                                ", (java.lang.CharSequence[]) strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("              aaaaaaaaaaaaaaaaaaaaaaaa                    ", strArray4, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "a...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa############################################", 767);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  hi#...", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       hi#..." + "'", str2, "                       hi#...");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              " + "'", str1, "                                                                              ");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444", "aahi#####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444" });
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAA", (java.lang.CharSequence) "aahi!                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", 64, "                                                                                                 hi!!ih A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             ###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str3, "                             ###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Aahi####", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aahi####" + "'", str2, "Aahi####");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", 176, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                       !ih                                !ih", 269);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                       !ih                                !ih" + "'", str2, "                                                                                                                                                                                                                                       !ih                                !ih");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aH" + "'", str1, "aH");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H", 761);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                               AHi############                                ", "############################################               a               #############################AAHI!########                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (-1), (int) (byte) -1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("a#hi!!ih################################################################################################", "ahi!aaahi!a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a#hi!!ih################################################################################################" + "'", str3, "a#hi!!ih################################################################################################");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444aahi4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           " + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           ");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" + "'", str1, "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a hi", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "          ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aahi4!" + "'", str8, "aahi4!");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI44444" + "'", str1, "444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI44444");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...##aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##########################################a ##########################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########" + "'", str1, "###############aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                     hi!...", "      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!..." + "'", str2, "hi!...");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!aaahi!a" + "'", str1, "ahi!aaahi!a");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                  ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#                                                                             #", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a hiaahia##########aahia########", 124, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a hiaahia##########aahia########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "a hiaahia##########aahia########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", "LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##########################################A                                  ##########################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class", 751, 176);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                a           ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                       ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                    #######...", 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################################################################", (java.lang.CharSequence[]) strArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("##########################################A", "4444444444444444444444444444444444444444444444444444444444444444444444444444 A");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444                                            ##########                                                                             ##########", strArray9, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("aahi######ahi##########ahi##########ahi##########ahi", strArray3, strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                    #######..." });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "##########################################" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "444444444444444444444444                                            ##########                                                                             ##########" + "'", str16, "444444444444444444444444                                            ##########                                                                             ##########");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "aahi######ahi##########ahi##########ahi##########ahi" + "'", str17, "aahi######ahi##########ahi##########ahi##########ahi");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "##############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ahi!aaahi!a", 312, 609);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #ahI!AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str2, "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI4                                                                                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI4                                                                                                 " + "'", str2, "hI4                                                                                                 ");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444 A 444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444 A 444444" + "'", str1, "44444 A 444444");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH" });
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4     4ih4     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4     4ih4     " + "'", str1, "4     4ih4     ");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                      hi!ihaa                       ", "#                                                                             #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihaa                       " + "'", str2, "hi!ihaa                       ");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaa          aaaaa", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               A                ", "a4!", "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               A                " + "'", str3, "               A                ");
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", "", "                                                                                    #######...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          a       ", "##############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                          a       " });
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("##hi#aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##hi#aaaaaaaaa" + "'", str1, "##hi#aaaaaaaaa");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IHAA", (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHAA" + "'", str3, "!IHAA");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                          ...", 29, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                          ..." + "'", str3, "                                                                          ...");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!IHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  aahi4   ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########################################                                  a#######", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "LASS[LJAVA.LANG.STRING;HICLASS[LJAVA.LANG.STRING;CLASS[CCLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "44444               A               444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", (java.lang.CharSequence) "                         A                                  A         aH                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" A", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A" + "'", str2, " A");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                       hi#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#..." + "'", str1, "hi#...");
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ", 928);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin", "                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin" + "'", str3, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" + "'", str2, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi#...", "", 87);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi#..." });
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A HI!        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", "#                                                                             #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa                 hi          !aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("       ...", "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       A                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAHI##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI##########" + "'", str1, "AAHI##########");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aahi!                                                                                              ", 77, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      " + "'", str3, "                      ");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                     AAHI!                                                     ", "aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     AAHI!                                                     " + "'", str2, "                                                     AAHI!                                                     ");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa                                          aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                          aaaaaaaaaaaaaaaaaaaaaaaa", "!ih a                                                                                                                                                                                             IH A");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        char[] charArray8 = new char[] { '4', '4', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                 ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                             A HI                                                                                                                                                              ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "A hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahia!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 901, 174);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                      ##########                                            " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(charSequence6, charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######...", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ...                                                                              ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A HI!     ", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                " });
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       A                                  a..." + "'", str2, "       A                                  a...");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("####################################################################################################", "                      aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                a           ", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a                                                  ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                a           " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                !ih                                !ih                     aaaaaaaaa", "     #hi#!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#######A##################################a######a#######A##################################", (java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                      aaaaaaaaaaaaaaaaaaaaaaaa       ", "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", "                                                                                                                                                                                                  AAHI!ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#################################################################################################", "########################################################################################################", "                                                                                                                                                                                                                                                  ###############a################                                                                                                                                                                                                                                                                                                               ", 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#################################################################################################" + "'", str4, "#################################################################################################");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" A               4             A               4       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " A               4             A               4       " + "'", str1, " A               4             A               4       ");
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                      a    ", "aAHI#####", "Ahi!!ih44444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######..." + "'", str1, "#######...");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "    " });
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!!ih", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aahi!" + "'", str5, "aahi!");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".class[c#######...class[ljava.lang.string;#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".class[c#######...class[ljava.lang.string;#######" + "'", str1, ".class[c#######...class[ljava.lang.string;#######");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a hi!!ih                                                                                                 ", (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a hi!!ih                                                                                                 " + "'", str3, "a hi!!ih                                                                                                 ");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a4hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444444444444444                                            ##########                                                                             ##########                                                     ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                             aIH                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a4hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAA####################", 180);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "############################################               a               ############################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihaA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!ihaA");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;" + "'", str1, "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hI4                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("##########################################A                                  ##########################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "A hi!!ih                                                                                                 ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi##########", (java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!IH", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################", "A", "                                  ", "##########################################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########################################", "", "", "##########################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!IH" + "'", str10, "HI!IH");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 527);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4a4a4a4a4a4a4a4a4a4a4", 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("iHA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHA" + "'", str1, "iHA");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               a                ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                     aahi!                                                     ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahi##########", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "               #######...A#######...                ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         4", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "                                                                                                Aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                       ...", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaaahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "  ...                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;" + "'", str1, "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444         Hi!               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 636 + "'", int1 == 636);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "#######...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "               a               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str4, "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AA######################################################################################################", (java.lang.CharSequence) "hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 690 + "'", int2 == 690);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                ", 97, "                                                                                                .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A4CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str1, "A4CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "##########################################A##########################################", "#################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!IHAA                         ", "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IHAA                         " + "'", str2, "hi!IHAA                         ");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aahiaahia!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4  HI4                                                                                              ", "                                                                                                                                                                                                                                                                                                                                   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "AHi############", (java.lang.CharSequence) "A 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                                          AAHI!i", (java.lang.CharSequence) "AAHI!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                 hi          !A             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("... [LJAVA.L...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... [ljava.l..." + "'", str1, "... [ljava.l...");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("a4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4hi!" + "'", str1, "A4hi!");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          aaaaa", 54, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 aaaaa" + "'", str3, "                                                 aaaaa");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                !ih           ", (java.lang.CharSequence) "AAHI###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaa     ", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa     " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa     ");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaa", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                           aaaaaaaaaaaaaa aaaaaaaaaaaaaa                                                                            ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ", "#######a                                  ##########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4hi!444hi!4", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaa4hi!444hi!4aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaa4hi!444hi!4aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "###444", (java.lang.CharSequence) "####################################################################################################################################################################################################################################################################################################                                            #                                                                             #                                                     #####################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...               4.string;c...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...               4.string;c..." + "'", str1, "...               4.string;c...");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                    A              ", (java.lang.CharSequence) "44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ihCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!ih", "aahi4                                                                                              ", "a##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##" + "'", str3, "!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444                                            ##########                                                                             ##########", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAHI44444444444", "  hi ##########", 319);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI44444444444" });
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "############################################               a               ############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                hi!", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ##        Hi!                                                                                                         ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaa", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaa");
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII                                                                                                          aAHI!i       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...            a4!...            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "            !ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" aH", 609);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                aH                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                aH                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                             ##########", "Ahi##########HI44444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                             ##########" });
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", 54, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { '4', '4', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                        ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                        ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            " + "'", str2, "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                    #                                                        ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4                    #                                                        " + "'", str4, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4                    #                                                        ");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                              ", "###############a################aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              " + "'", str2, "                                                                              ");
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" });
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih" + "'", str1, "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("##########                        ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Hi!", "44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                         a hi!               ", "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("##hi#aaaaaaaaaa                  ", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ", 3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                               AAAAAAAAAAAAAAAAAAAAAAAA     ", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                               AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHIaaaaaaaaaaaaa######################################################################" });
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "A HI!!IH                                                                                                                   aahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aaaaa          aaaaa", (java.lang.CharSequence) "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                 hi          !", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaahiaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################A ##########################################" + "'", str1, "##########################################A ##########################################");
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "  4  ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##" + "'", str1, "!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                      aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IH", "aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi" + "'", str2, "aahi");
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Ahi##########HI!                                      ", 901, 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                !ih                                !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                !ih" + "'", str1, "!ih                                !ih");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA", (java.lang.CharSequence) "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA" + "'", charSequence2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    aahi4!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...            a4!...            ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih !ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###############a#hi!########...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "AAHIA!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "...            a4!...            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A             ", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A             " + "'", str2, "A             ");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                             4", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaa", "AAHI######!IH                               ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("               A               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               A               " + "'", str1, "               A               ");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               A               ", "aahi!", 4);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "               A               " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A" });
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "  aaaaaaaaaaaaaaaaaaaaaaaaaaa   ", (java.lang.CharSequence) "                     hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ", (java.lang.CharSequence) "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  AAHI4   ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a", " ", "hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a hiaahia##########aahia########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##hi#aaaaaaaaa", (java.lang.CharSequence) "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", "a hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aahi######!ih                                                                 ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 ", strArray5, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 16");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 " + "'", str10, "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                                " });
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444444444444444444444444444444444444444444444444444444", "a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi4!", " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4!" + "'", str2, "hi4!");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", 104);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "  ...                                                                              ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi4", 767, "  ... ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   .." + "'", str3, "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..");
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCC!ih", (java.lang.CharSequence) "aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "...C;GNIRTS.4               ...", (java.lang.CharSequence) "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                           ##########                                            ###");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAA" });
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AIH                                                                                                 ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ...", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 523 + "'", int3 == 523);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444 ##        Hi!" + "'", str2, "4444444444 ##        Hi!");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;", "!IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###Hi!###", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###Hi" + "'", str2, "###Hi");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.4                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I" + "'", str1, "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "A hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444AAHI444444444444444444444444", (java.lang.CharSequence) "##########                 ##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                 hi!!ih A", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", (java.lang.CharSequence) "class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "Ahi!!ih", (java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ", 915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "               ...    ...A...    ...                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "H  HH! 4", "!##CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!##");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "CCCCCCCCCCCCCCCCCCCCC!ih", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!IH                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                    aaaaaaaaaaa", (java.lang.CharSequence) "aahi4                                                                                              ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string", 968);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 523, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                            ", 0, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            " + "'", str3, "                                            ");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAA", (java.lang.CharSequence) "...44444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#..                                                 a  aahi4", "class [L");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..                                                 a  aahi4" + "'", str2, "#..                                                 a  aahi4");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", 246);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("A HI!        ...", "#################################################################aaaaaaaaaaaa", "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#################################################...###########################################################", "      ###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################...###########################################################" + "'", str2, "#################################################...###########################################################");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "##########", (java.lang.CharSequence) "##############################################################A                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi##########");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "a");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "##########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahia##########" + "'", str3, "aahia##########");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "CLASS [cCLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "               A               ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                      ##########", "  4  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) " Hi!          ", (java.lang.CharSequence) "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("class [L");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [L" + "'", str1, "class [L");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAHIA!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", (int) (byte) -1, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...               4.STRING;C...", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...               4.STRING;C...                                                                                                                                        " + "'", str2, "...               4.STRING;C...                                                                                                                                        ");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "               ", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str4, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("          ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 44, 24);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ', 13, 249);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "aaaaaaaaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str2, "aaaaaaaaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                               #...", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahi!" });
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       ", "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaa", (java.lang.CharSequence) "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.4                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str1, "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ih A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                            #                                                                             #                                                     ", "     h!               ", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#", "#" });
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "#############################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################" + "'", str2, "#############################################################");
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AA######################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA######################################################################################################" + "'", str1, "aA######################################################################################################");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "               a               ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                         AAHI!ih                                                                                                                          ", "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                         AAHI!ih                                                                                                                          " + "'", str2, "                                                                                                                         AAHI!ih                                                                                                                          ");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aahia##########aahia####", (java.lang.CharSequence) "                                      ########## 444444444444444444444444                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "###Hi!###", (java.lang.CharSequence) "                                #               a                #                                 ", 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("               hi!                ", "################################################################################################################################################################################################################################################################################################################################", (int) (byte) 1);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", strArray5, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     ...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ", strArray5, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "               hi!                " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str7, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "", "", "", "..." });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ..." + "'", str11, "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ...");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String[] strArray9 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "a");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray9, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray9);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4', 0, (-1));
        boolean boolean20 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 90 + "'", int15 == 90);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                                                                   !iH        ##", (java.lang.CharSequence) "CLASS[cCLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                   !iH        ##" + "'", charSequence2, "                                                                                   !iH        ##");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) " ##        Hi!               ", (java.lang.CharSequence) "#A#", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", (java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

