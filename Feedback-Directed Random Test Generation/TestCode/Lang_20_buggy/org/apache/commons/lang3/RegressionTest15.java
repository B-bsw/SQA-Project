package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

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
    public void test07501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ahi##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07503");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 15, (int) (byte) 10);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test07504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...AAAAAAA", 876, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA");
    }

    @Test
    public void test07505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("A               A               A          ##hi#aaaaaaaaaA               A               A          ", 792, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...######aahia##########aahia###...", "                                                                                                                         AAHI!ih                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...######aahia##########aahia###..." + "'", str2, "...######aahia##########aahia###...");
    }

    @Test
    public void test07507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07507");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a#hi!!ih################################################################################################", "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", 124);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a#hi!!ih################################################################################################" });
    }

    @Test
    public void test07508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                             aIH                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA" + "'", str2, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
    }

    @Test
    public void test07511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07511");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charSequence1, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                a                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07513");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...            a4!...            ", (java.lang.CharSequence) "AHI       ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07514");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "class [L", (java.lang.CharSequence) "AAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test07516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih" + "'", str2, "aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih");
    }

    @Test
    public void test07517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;", "!iH        ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07518");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########", "aahi4", 31);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi       ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07520");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                    hi!                ", 761);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test07523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                     ##########                                                                             ##########                                           ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07524");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AHi       AHi      #a#AHi       AHi       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "A", "Hi", "       ", "A", "Hi", "      ", "#", "a", "#", "A", "Hi", "       ", "A", "Hi", "       " });
    }

    @Test
    public void test07525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaa...", "...aaa#######################################################################aaaaaaaaaaaaa");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaa...");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a  aahi4", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("A               ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaa..." });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "  ", "hi4" });
    }

    @Test
    public void test07527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07527");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa", (java.lang.CharSequence) "hi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str1, "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test07529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("..#######################################################################################################################################################################################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..#######################################################################################################################################################################################################" + "'", str2, "..#######################################################################################################################################################################################################");
    }

    @Test
    public void test07531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                !ih                ", "  i! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07532");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aHi       ", (java.lang.CharSequence) "aaaaaaaaaaaaaa", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
    }

    @Test
    public void test07534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ahi##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI##########" + "'", str1, "AHI##########");
    }

    @Test
    public void test07535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07535");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test07537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", "aaaaaaaaaaaaaaaaaaaaaaaa", 638);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!" });
    }

    @Test
    public void test07538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI" + "'", str1, "AHI");
    }

    @Test
    public void test07539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aHi", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHi" + "'", str2, "aHi");
    }

    @Test
    public void test07540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07540");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 a                                                  ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                   ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAA...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test07541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                             4", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" ########## aaaaaaaaaaaaaaaaaaaaaaaa", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ########## 444444444444444444444444" + "'", str3, " ########## 444444444444444444444444");
    }

    @Test
    public void test07544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("  AAHI4   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  AAHI4   " + "'", str1, "  AAHI4   ");
    }

    @Test
    public void test07545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07545");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "               #######...A#######...                ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                               ################################################################################", "#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi", 767);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               ################################################################################" + "'", str3, "                               ################################################################################");
    }

    @Test
    public void test07547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("##hi#aaaaaaaaaa", 767, 928);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aahi###", "...C;GNIRTS.aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi###" + "'", str2, "aahi###");
    }

    @Test
    public void test07549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##############################################################A                                  ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################A                                  " + "'", str2, "##############################################################A                                  ");
    }

    @Test
    public void test07550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "", "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 180, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############" + "'", str3, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############");
    }

    @Test
    public void test07554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07555");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                  A", 319, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07556");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("       iHA       iHA#a#      iHA       iHA", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       iHA       iHA#a#      iHA       iHA" + "'", str2, "       iHA       iHA#a#      iHA       iHA");
    }

    @Test
    public void test07558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "       #hi#!", (java.lang.CharSequence) "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###AAAAAAAAAAAAHI#######AAAAAAAAAAA", 62, 312);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAAAAAAAAAAAHI#######AAAAAAAAAAA" + "'", str3, "###AAAAAAAAAAAAHI#######AAAAAAAAAAA");
    }

    @Test
    public void test07560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                 hi          !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi          !" + "'", str1, "hi          !");
    }

    @Test
    public void test07562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA", 20, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str3, "#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test07563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;" + "'", str3, "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
    }

    @Test
    public void test07565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07565");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07566");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi##########", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "    ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", strArray4, strArray7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 42, 0);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach(" A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a", strArray4, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aahi!" + "'", str10, "aahi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str11, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "  ", "...", " ", "#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test07567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07567");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "                                         ######################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07569");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI######!IH                               ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07570");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!IHAA", "aahi######ahi##########ahi##########ahi##########ahi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "!IHAA" });
    }

    @Test
    public void test07571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###############a################", 876);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test07572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;" + "'", str2, "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;");
    }

    @Test
    public void test07573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("           #########            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########" + "'", str1, "#########");
    }

    @Test
    public void test07574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi##########", 8, 968);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####" + "'", str3, "####");
    }

    @Test
    public void test07575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test07576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Aahi#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07578");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##########                        ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    aahi4!" + "'", str5, "    aahi4!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aahi#####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####" + "'", str4, "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####");
    }

    @Test
    public void test07580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    aahi4!", "                                                                                              ", 62);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    aahi4!" });
    }

    @Test
    public void test07581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4ih" + "'", str1, "4ih");
    }

    @Test
    public void test07582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07582");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aih                                                                                                 ", (java.lang.CharSequence) "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA" + "'", str1, "CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test07584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAHI!ih", (java.lang.CharSequence) "#                                                                             #");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##########", 53, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444##########4444444444444444444444" + "'", str3, "444444444444444444444##########4444444444444444444444");
    }

    @Test
    public void test07587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07587");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str1, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test07588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07589");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ahi", "!", "aaahi", "!", "a", "                                                                                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " ", "##", "        ", "Hi", "!" });
    }

    @Test
    public void test07590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07590");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa#", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", (java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test07592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                    ", "#A#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test07593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 " + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
    }

    @Test
    public void test07594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4" + "'", str1, "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
    }

    @Test
    public void test07595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                             4", (java.lang.CharSequence) "..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07596");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaa", "    ", "aaaaaaaaaaaaaa" });
    }

    @Test
    public void test07597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH" + "'", str2, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH");
    }

    @Test
    public void test07598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07598");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a hi!               ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               A                ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test07599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hi!...", 250);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################hi!...##########################################################################################################################" + "'", str3, "##########################################################################################################################hi!...##########################################################################################################################");
    }

    @Test
    public void test07600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07600");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", "AAHI!", 111, 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############################################               a               #############################AAHI!########                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            " + "'", str4, "############################################               a               #############################AAHI!########                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
    }

    @Test
    public void test07601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07601");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "  AAHI4   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " });
    }

    @Test
    public void test07602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07602");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444", (java.lang.CharSequence) "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07603");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4hi!444hi!4", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 876 + "'", int2 == 876);
    }

    @Test
    public void test07604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07604");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                             aIH                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07605");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih", "...##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih" + "'", str2, "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
    }

    @Test
    public void test07607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("              ", "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              " + "'", str2, "              ");
    }

    @Test
    public void test07608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "          aaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 15);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07610");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          Hi!           ", "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#########aahia##########aahia#####", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "", " Hi!           " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test07611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07611");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!" + "'", str1, "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
    }

    @Test
    public void test07612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test07613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07613");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aahi!                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07614");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                  A");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07615");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "a4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aahi", "ahi       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi" + "'", str2, "aahi");
    }

    @Test
    public void test07617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07617");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                                                                                                                                                 ", (java.lang.CharSequence) "hhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("##########                                                                             ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################" + "'", str1, "####################");
    }

    @Test
    public void test07619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07619");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                 hi          !A             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                    A              ", "###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    A              " + "'", str2, "                    A              ");
    }

    @Test
    public void test07621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", 55, "ahi#ahi#ahi#ahi#aahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str3, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test07622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07622");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                         a4!                                                                                                                                                                                                                                                                                                                                                          ", (java.lang.CharSequence) "A hi!!ih                                                                                                 ", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07623");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa#####################################################################", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi4!", "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4!" + "'", str2, "hi4!");
    }

    @Test
    public void test07625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                         ##########", (java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "######################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AHI       ", "#######################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI       " + "'", str2, "AHI       ");
    }

    @Test
    public void test07628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Ahi##########HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ahi##########HI!" + "'", str1, "Ahi##########HI!");
    }

    @Test
    public void test07629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07629");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "    ", "AAHI", "4", "!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test07630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07630");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4", "", 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "a#hi!!ih################################################################################################");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                               ", strArray6, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                               " + "'", str11, "                               ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Aahi####", "aahi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07634");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####" + "'", str1, "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####");
    }

    @Test
    public void test07636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("a#hi!!ih#################################################################################################", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#hi!!ih##..." + "'", str2, "a#hi!!ih##...");
    }

    @Test
    public void test07637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                      hi!ihaa                       ", (int) (short) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      hi!ihaa                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                      hi!ihaa                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H", "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H" + "'", str2, "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
    }

    @Test
    public void test07640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07640");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07641");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                  ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 a  aahi4", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAHI!i");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##hi#aaaaaaaaaa", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI", "!", "i" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test07643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07643");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test07644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                 ", "                               AHi############                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444" + "'", str2, "4444444");
    }

    @Test
    public void test07646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a hi!!ih                                                                                                 ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!!ih                                                                                                 " + "'", str2, "a hi!!ih                                                                                                 ");
    }

    @Test
    public void test07647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07648");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "AAHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ih", "A               A               A          ##hi#aaaaaaaaaA               A               A          ", " s ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07650");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", (java.lang.CharSequence) "aAHI#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07651");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07652");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI######!IH                                                                 AAHI######!IH      ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07653");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                444", 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07654");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4                !IH                                                                              44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4                !IH                                                                              44" });
    }

    @Test
    public void test07655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07655");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#####################################################", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07656");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                             A HI                                                                                                                                                              ", "", 97);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                             A HI                                                                                                                                                              " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                             A HI                                                                                                                                                              " + "'", str4, "                                                                                                                                                             A HI                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                             A HI                                                                                                                                                              " + "'", str6, "                                                                                                                                                             A HI                                                                                                                                                              ");
    }

    @Test
    public void test07658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07658");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aih                                                                                                 ", (java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07660");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "                                                                                                 HI!ihaa", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07661");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "a hi!!ih                                                         ...", (java.lang.CharSequence) "a", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07662");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "AAHI###", "####aahia##########aahia##########aahia####");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07663");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ", (java.lang.CharSequence) "aaaaaaaaaaaaaa", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07664");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Comparable<java.lang.String>[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!" + "'", str8, "!");
    }

    @Test
    public void test07665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                       " + "'", str2, "                                                                                                                                                       ");
    }

    @Test
    public void test07666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "!IH                                                                                                 ", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444444", "AAHI##########", "                                                                                                 HI!ihaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07671");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########", "aahia!", (int) (byte) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "###############a#hi!########...");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                      ##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                      " });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07672");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a hi!!ih                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a", " ", "hi", "!!", "ih", "                                                                                                 " });
    }

    @Test
    public void test07673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07673");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######################################################################################################################", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 901);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######################################################################################################################" });
    }

    @Test
    public void test07674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("      ###aaaaaaaaaaaaaaAAHIaaaaa...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test07678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!", "     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                 hi          !A             ", 767, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######...class [c#######...class [ljava.lang.string;#######" + "'", str1, "#######...class [c#######...class [ljava.lang.string;#######");
    }

    @Test
    public void test07681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      ###aaaaaaaaaaaaaaAAHIaaaaa...", 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      ###aaaaaaaaaaaaaaAAHIaaaaa..." + "'", str3, "      ###aaaaaaaaaaaaaaAAHIaaaaa...");
    }

    @Test
    public void test07682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                   A hi", "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07683");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              ####aahia##########aahia##########aahia#####                              ", (java.lang.CharSequence) "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07684");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "class [Cclass [Ljava.lang.String;", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aahi!                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########" + "'", str1, "...##########");
    }

    @Test
    public void test07687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "i", (java.lang.CharSequence) "aAHI!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("####################aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "####################aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                         ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
    }

    @Test
    public void test07691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07691");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07692");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "ahi!", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07693");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                               ", (java.lang.CharSequence) "hI", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444         Hi!               " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444         Hi!               ");
    }

    @Test
    public void test07695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                !ih                                !ih                     aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                !ih                     aaaaaaaaa" + "'", str1, "!ih                                !ih                     aaaaaaaaa");
    }

    @Test
    public void test07696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ", "                                                     ##########                                                                             ##########                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07697");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                   ", "                               ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (int) '4', 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test07698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07698");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A HI                                                                                                                                                                                             a hi!", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07699");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test07700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07700");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, charSequence1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test07701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a  a  a  a  a  a  a  a  a  a  a" + "'", str2, "a  a  a  a  a  a  a  a  a  a  a");
    }

    @Test
    public void test07702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" ########## 444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########", "444444444444444444444444" });
    }

    @Test
    public void test07703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA", "hi4!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test07706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07707");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", "", 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" });
    }

    @Test
    public void test07708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07709");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "#####################################################", 68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test07711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" aHi", 968, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test07712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", (java.lang.CharSequence) "hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07713");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "a hi!     ", 96, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test07715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##############################################################A                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################A" + "'", str1, "##############################################################A");
    }

    @Test
    public void test07716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test07717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...class              #...class [Ljava.lang...." + "'", str2, "...class              #...class [Ljava.lang....");
    }

    @Test
    public void test07718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07718");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "#..", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str1, "#################################################################AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test07720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07720");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##        H", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07721");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AHi       ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str2, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test07723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            #                                                                             #                                                     ", 761, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################################################################################################################################################################################################                                            #                                                                             #                                                     #####################################################################################################################################################################################################################################################################################################" + "'", str3, "####################################################################################################################################################################################################################################################################################################                                            #                                                                             #                                                     #####################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test07724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aahi#...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  hi ##########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi ##########" + "'", str2, "  hi ##########");
    }

    @Test
    public void test07726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "H                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07727");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07728");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            " + "'", str1, "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ");
    }

    @Test
    public void test07729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ", "                                                                                               #... ", 792);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI######!IHAAHI######!IH", "                                                                              hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07731");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ", (java.lang.CharSequence) "AAHIaaaaaaaaaaaaa#####################################################################", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07733");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44", (java.lang.CharSequence) " HI4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("haaaaaaaaa", "##########                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaaaaaaaa" + "'", str2, "haaaaaaaaa");
    }

    @Test
    public void test07735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07735");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", charSequence2, "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test07736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Cclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;", 250, "#####################################################ahi###############################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Cclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;" + "'", str3, "class [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Cclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;");
    }

    @Test
    public void test07737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4  HI4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4  hi4                                                                                              " + "'", str1, "4  hi4                                                                                              ");
    }

    @Test
    public void test07738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !ih" + "'", str1, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !ih");
    }

    @Test
    public void test07739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ", "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07740");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 864 + "'", int2 == 864);
    }

    @Test
    public void test07741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4ihaa  a", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4ihaa  a" + "'", str2, "4ihaa  a");
    }

    @Test
    public void test07742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07742");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##hi#aaaaaaaaaa                   ", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi#aaaaaaaaaa                   " + "'", str2, "##hi#aaaaaaaaaa                   ");
    }

    @Test
    public void test07744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07744");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ##        Hi!               ", "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4", 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " ##        Hi!               " });
    }

    @Test
    public void test07745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test07746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                               aaaaaaaaaaaaaaaaaaaaaaaa      ", "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               aaaaaaaaaaaaaaaaaaaaaaaa      " });
    }

    @Test
    public void test07747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               " + "'", str1, "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               ");
    }

    @Test
    public void test07748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 876, 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                           Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                          hi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aahi!" + "'", str6, "aahi!");
    }

    @Test
    public void test07751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07751");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       #HI#!", (java.lang.CharSequence) "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                          aHi       ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aHi       " + "'", str2, "aHi       ");
    }

    @Test
    public void test07753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("              hi!              ", "               hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                      aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07756");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "               4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               ", 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!IHAA" });
    }

    @Test
    public void test07757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07757");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", (java.lang.CharSequence) "a hi!!ih", 326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##########################################A##########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################A##########################################" + "'", str1, "##########################################A##########################################");
    }

    @Test
    public void test07759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07759");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####################                a           ####################", (java.lang.CharSequence) "                                                                              hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A" + "'", str1, "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A");
    }

    @Test
    public void test07761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07761");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaa                                                                                                 hi!IHAA", "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", "  ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                             aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "... [LJAVA.L...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa");
    }

    @Test
    public void test07763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###AAAAAAAAAAAAAAaahiAAAAA...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###AAAAAAAAAAAAAAaahiAAAAA..." });
    }

    @Test
    public void test07765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 876, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07766");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               ", (java.lang.CharSequence) "aahi#...", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a hi!!ih                                                                                                                   AAHI!", "A hi!!ih                                                                                                                   AAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!!ih                                                                                                                   AAHI!" + "'", str2, "a hi!!ih                                                                                                                   AAHI!");
    }

    @Test
    public void test07768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4a", "                                                                                                444", 968);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 903, 180);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4a" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07769");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "     h!                ", 694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07771");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...class              #...class [Ljava.lang....");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...class              #...class [Ljava.lang..." + "'", str1, "...class              #...class [Ljava.lang...");
    }

    @Test
    public void test07773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH" + "'", str2, "AAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH");
    }

    @Test
    public void test07774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[" + "'", str1, "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[");
    }

    @Test
    public void test07775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07775");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                              ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test07776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07776");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################################################################", "4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444", (int) (byte) -1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII" + "'", str5, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test07777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################################################ahi###############################################################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####################################################", "hi###############################################################" });
    }

    @Test
    public void test07779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaahiaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaahiaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test07780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07782");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "           #########            ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07783");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 a" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
    }

    @Test
    public void test07784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07784");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("AHI##########", "                                                                                                .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI######!IH                                                                 AAHI######!IH      ", "                !ih                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH      " + "'", str2, "AAHI######!IH                                                                 AAHI######!IH      ");
    }

    @Test
    public void test07787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07787");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a", (java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test07788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07789");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "4");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 44, 42);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", (java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#A#", " A", 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("hi!                ", strArray9, strArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 312 + "'", int15 == 312);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "#A#" });
    }

    @Test
    public void test07790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07790");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####aahia##########aahia##########aahia#####", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 13);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("a...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa############################################", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                              " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "####aahia##########aahia##########aahia#####" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa############################################" + "'", str8, "a...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa############################################");
    }

    @Test
    public void test07791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########################################A", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################A" + "'", str2, "##########################################A");
    }

    @Test
    public void test07792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07793");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                                 hi!IHAA", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH      ...", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##############################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################" + "'", str1, "##############################################################################");
    }

    @Test
    public void test07795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4hi!444hi!4", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!444hi!4" + "'", str2, "4hi!444hi!4");
    }

    @Test
    public void test07796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07796");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", (java.lang.CharSequence) "...AAAAAAA", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07797");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH", 694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07798");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!        ...", (java.lang.CharSequence) "AHI       #######################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07799");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444               A               444444", "#######################################################################################       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444               A               444444" + "'", str2, "444444444444444444               A               444444");
    }

    @Test
    public void test07801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ..." + "'", str2, "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...");
    }

    @Test
    public void test07802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...            a4!...            ", (java.lang.CharSequence) "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07803");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                          aHi       ", 39, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("            !ih                                                                                                ", "                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            !ih                                                                 " + "'", str2, "            !ih                                                                 ");
    }

    @Test
    public void test07807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07807");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######...", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  ...                                                                              ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test07808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA", (java.lang.CharSequence) "A HI!!IH                                                                                                                   aahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07811");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                       ...", 767);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test07813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("############################################               a               ############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################               a               ############################################" + "'", str1, "############################################               a               ############################################");
    }

    @Test
    public void test07814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07814");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("######################################################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "######################################################################" });
    }

    @Test
    public void test07815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07815");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 68 + "'", int12 == 68);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test07816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AIH                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07817");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA" });
    }

    @Test
    public void test07818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 757, 757);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#...", "###AAAAAAAAAAAAHI#######AAAAAAAAAAA", "ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07822");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "####################                a           ####################", (java.lang.CharSequence) "AAHI##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test07823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07823");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a  aahi4", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...class              #...class [Ljava.lang...", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test07824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a", (java.lang.CharSequence) "############################################               a               #############################AAHI!########                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" aHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aH" + "'", str1, " aH");
    }

    @Test
    public void test07829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHH..." + "'", str1, "HHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test07830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07830");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###############a################", "", "..#######################################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################aAAHI" + "'", str2, "######################################################################aAAHI");
    }

    @Test
    public void test07832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aahi########## #..                                                 a  aahi4", "  i! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  i! " + "'", str2, "  i! ");
    }

    @Test
    public void test07833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", (java.lang.CharSequence) "                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 8, "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", (java.lang.CharSequence) "##hi#aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07837");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                             A HI                                                                                                                                                              ", "", 97);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          ", (java.lang.CharSequence[]) strArray11);
        java.lang.Class<?> wildcardClass13 = strArray11.getClass();
        java.lang.Class[] classArray15 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray16 = (java.lang.Class<?>[]) classArray15;
        wildcardClassArray16[0] = wildcardClass6;
        wildcardClassArray16[1] = wildcardClass13;
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray16);
        java.lang.Class<?> wildcardClass23 = wildcardClassArray16.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                                                                                                                                             A HI                                                                                                                                                              " });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(classArray15);
        org.junit.Assert.assertArrayEquals(classArray15, new java.lang.Class[] { char[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray16);
        org.junit.Assert.assertArrayEquals(wildcardClassArray16, new java.lang.Class[] { char[].class, java.lang.String[].class });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class [Cclass [Ljava.lang.String;" + "'", str21, "class [Cclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class [Cclass [Ljava.lang.String;" + "'", str22, "class [Cclass [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07838");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########                                            ", 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aAHI!i", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                          aAHI!i                                                                                                           " + "'", str2, "                                                                                                          aAHI!i                                                                                                           ");
    }

    @Test
    public void test07840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", 58, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!" + "'", str3, "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
    }

    @Test
    public void test07841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07841");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...class              #...class [Ljava.lang...", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ", 876);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ");
    }

    @Test
    public void test07843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07843");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", (java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test07844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07845");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("              Hi!               ", '4');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#######################################################################################################################", (java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "              Hi!               " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07847");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##        H", "hi##########hi####", "aahiaahia!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##        H" + "'", str3, "##        H");
    }

    @Test
    public void test07848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07848");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a hi!!ih                                                         ...", (java.lang.CharSequence) "aahi!                                                                                              ", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
    }

    @Test
    public void test07849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aahia##########", (java.lang.CharSequence) "                !ih               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07850");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07851");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07852");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aAHI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07853");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                         4IHAA", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         4IHAA" + "'", str2, "                                                                         4IHAA");
    }

    @Test
    public void test07855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07855");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07856");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih", (int) (short) -1, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        " + "'", str1, "                        ");
    }

    @Test
    public void test07858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("A hi!!ih                                                                                                 ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 903);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07860");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ahi!...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ahi!..." });
    }

    @Test
    public void test07861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("####aahia##########aahia##########aahia#####", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (java.lang.CharSequence) "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07864");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI######AHI##########AHI######");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI######AHI##########AHI######" });
    }

    @Test
    public void test07865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!IH", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07868");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07869");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", (java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07870");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 78);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                         AAHI!ih                                                                                                                          ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############", "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI4                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI4                                                                                                 " + "'", str1, "hI4                                                                                                 ");
    }

    @Test
    public void test07873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ", "##########                        ##########      a4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
    }

    @Test
    public void test07874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07875");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                !ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test07876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "  ...                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################" + "'", str1, "#######################################################################");
    }

    @Test
    public void test07878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AAHIaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
    }

    @Test
    public void test07880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07880");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "ahi!...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                !ih                                !ih", "...               4.STRING;C...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !ih                                !ih" + "'", str2, "                                !ih                                !ih");
    }

    @Test
    public void test07884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07884");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    aahi4!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...            a4!...            ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##hi#aaaaaaaaaa", charArray6);
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
    public void test07885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07885");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence) "aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07887");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07888");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                !ih                                !ih", "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", "A HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !ih                                !ih" + "'", str3, "                                !ih                                !ih");
    }

    @Test
    public void test07890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ahi        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07891");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "##########", "HI", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07892");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                    hi!                ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07893");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################################aaaaaaaaaaaaa", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test07894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################################################################", "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", 31);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################################################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##        Hi!" + "'", str1, "##        Hi!");
    }

    @Test
    public void test07898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07898");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI######AHI##########AHI######", 694, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07899");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################", (java.lang.CharSequence) "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                        ...", "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                        ..." });
    }

    @Test
    public void test07901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                !ih                                !ih", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih !ih" + "'", str2, "!ih !ih");
    }

    @Test
    public void test07902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               " + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
    }

    @Test
    public void test07903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!IHAA                         ", (java.lang.CharSequence) "            !ih                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            " + "'", str1, "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
    }

    @Test
    public void test07905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07905");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "Ahi##########HI!", (java.lang.CharSequence) "...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Ahi##########HI!" + "'", charSequence2, "Ahi##########HI!");
    }

    @Test
    public void test07906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07906");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                         ######################################################################                                         ##############     h!                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                         ", "######################################################################", "                                         ", "##############", "     ", "h", "!", "                " });
    }

    @Test
    public void test07907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...               4.string;c...", "aahi######ahi##########ahi##########ahi##########ahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...               4.string;c..." + "'", str2, "...               4.string;c...");
    }

    @Test
    public void test07908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07909");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi          !", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aahiaah                 hi          !aahiaah", "", "###################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahiaah                 hi          !aahiaah" + "'", str3, "aahiaah                 hi          !aahiaah");
    }

    @Test
    public void test07911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI", "##########                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI" });
    }

    @Test
    public void test07912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07912");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "a", "hi!" };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, charSequenceArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih", 76, 62);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, "...#######a...#######");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a hi!" + "'", str6, "a hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a hi!" + "'", str8, "a hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a...#######a...#######hi!" + "'", str14, "a...#######a...#######hi!");
    }

    @Test
    public void test07913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihaa" + "'", str1, "ihaa");
    }

    @Test
    public void test07914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih" + "'", str1, "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
    }

    @Test
    public void test07915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07917");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!IHAA", (java.lang.CharSequence) "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07918");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  ahia a##########", 970, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ahi!...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!..." + "'", str2, "ahi!...");
    }

    @Test
    public void test07921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", "               hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", "a  a  a  a  a  a  a  a  a  a  a");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!" });
    }

    @Test
    public void test07925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...", (java.lang.CharSequence) "HICLASS...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                               A HI!        ..." + "'", str2, "                                                                                                                                                                                                                                               A HI!        ...");
    }

    @Test
    public void test07929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               A                ", (java.lang.CharSequence) "##########################################a                                  ##########################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                   a hi", "hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A" + "'", str3, "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A");
    }

    @Test
    public void test07932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI######!IHAAHI######!IH" + "'", str1, "aAHI######!IHAAHI######!IH");
    }

    @Test
    public void test07933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07933");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          aaaaa", 64);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07934");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07935");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "aahi", 15);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                           A HI!        ...", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("############################################               a               #############################AAHI!########                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("a hi!!ih                                                         ...", " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!!ih                                                         ..." + "'", str2, "a hi!!ih                                                         ...");
    }

    @Test
    public void test07938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test07939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4ih", 15, "4              hI!               44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4     4ih4     " + "'", str3, "4     4ih4     ");
    }

    @Test
    public void test07940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07941");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 32, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAA" + "'", str3, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAA");
    }

    @Test
    public void test07943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07943");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4", (java.lang.CharSequence) "aAHI#####", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                        ##########                                            ###                                                                                                              ", "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaa44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa44444               A               444444" + "'", str1, "aaaaaaaaaaaaa44444               A               444444");
    }

    @Test
    public void test07947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  ##########" + "'", str1, "  ##########");
    }

    @Test
    public void test07948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "", (java.lang.CharSequence) "...##########################...", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07949");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A", "           #########            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A" + "'", str2, "CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;4A");
    }

    @Test
    public void test07951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07951");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#########aahia##########aahia#####", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07952");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 55, 326);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a", "hi!" });
    }

    @Test
    public void test07953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih                                                                                                ", "                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test07954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07954");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444 ", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444 " });
    }

    @Test
    public void test07955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4a4a4a4a4a4a4a4a4a4a4" + "'", str2, "4a4a4a4a4a4a4a4a4a4a4");
    }

    @Test
    public void test07956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test07957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test07958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test07959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07959");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", "aahiaah                 hi          !aahiaah", "#######...class [c#######...class [ljava.lang.string;#######");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07961");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "##########                        ", (java.lang.CharSequence) "                 hi          !A             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "##########                        " + "'", charSequence2, "##########                        ");
    }

    @Test
    public void test07962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;", " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test07964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaa    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test07965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", 638, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih");
    }

    @Test
    public void test07966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                         #####################################################################", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test07968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444", "44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07969");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  HI ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ahi        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi" + "'", str1, "ahi");
    }

    @Test
    public void test07971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07971");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "    aahi4!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...            a4!...            ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4ihaa  a                                                                                            ", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test07974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07974");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a##########", 68, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a##########444444444444444444444444444444444444444444444444444444444" + "'", str3, "a##########444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     a4hi!     ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "     a4hi!     " });
    }

    @Test
    public void test07976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07976");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;" + "'", charSequence2, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
    }

    @Test
    public void test07977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07977");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aAHI", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 177, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07978");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "ih A", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07979");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", charSequence1, 761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                      aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      aaaaaaaaa" + "'", str1, "                                      aaaaaaaaa");
    }

    @Test
    public void test07981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("A             ", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A             " + "'", str2, "A             ");
    }

    @Test
    public void test07982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07982");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 94, 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AHI        AHI        hAHI        ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07985");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07986");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                                                                             A HI                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 319 + "'", int1 == 319);
    }

    @Test
    public void test07987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                   ", "                      ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test07988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07988");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "                                           ##########                                            ", 4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi4", strArray5, strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence[]) strArray10);
        java.lang.Class<?> wildcardClass14 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aahi4" + "'", str11, "aahi4");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hiA", "hi" });
    }

    @Test
    public void test07990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AHi       ", (int) (byte) -1, "!IH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi       " + "'", str3, "AHi       ");
    }

    @Test
    public void test07991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################################", "AAHI!ih", "class [Cclass [Ljava.lang.String;");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "                   A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class" + "'", str1, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class");
    }

    @Test
    public void test07995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07995");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                                                   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aahi", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi" + "'", str2, "aahi");
    }

    @Test
    public void test07998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...class              #...class [Ljava.lang....", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test07999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AHI       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test08000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444AAHI444444444444444444444444", 9, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444AAHI444444444444444444444444" + "'", str3, "444444444444444AAHI444444444444444444444444");
    }
}

