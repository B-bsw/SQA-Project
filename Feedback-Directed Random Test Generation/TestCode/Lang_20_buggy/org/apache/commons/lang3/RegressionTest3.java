package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "               A               ", 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                     AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444", "                      ##########", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 638 + "'", int1 == 638);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "     hi!                ", 9, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("               A                ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               A                " + "'", str2, "               A                ");
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "               A                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaa####################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa####################" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa####################");
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4" + "'", str2, "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AHi       ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aahi4!", (java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "##########################################A##########################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("               a hi!        ...    ", (int) (short) 0, "               a hi!               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               a hi!        ...    " + "'", str3, "               a hi!        ...    ");
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("A hi", "aaaaaaaaaaaaaaaaaaaaaaaa####################", "##########                                            444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 104, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", (java.lang.CharSequence) "a hi", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence) "A hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", strArray5, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("a  aahi4", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str9, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!ih" + "'", str12, "!ih");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a  aahi4" + "'", str13, "a  aahi4");
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a hi", "                !ih                                                                              ", "                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;" + "'", str1, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                           ##########                                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi4" + "'", str1, "aahi4");
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("A");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "A" });
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi", (java.lang.CharSequence) "  hi ##########", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!IHAA", (java.lang.CharSequence) "                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IHAA" + "'", str1, "HI!IHAA");
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("               a hi!        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               a hi!        ..." + "'", str1, "               a hi!        ...");
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               A               ", "##########", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               A               " + "'", str3, "               A               ");
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                            ", (java.lang.CharSequence) "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                           ##########                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahiaahia!!", "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahiaahia!!" + "'", str2, "aahiaahia!!");
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                 a  aahi4", (java.lang.CharSequence) "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("a hi!", "aahi######");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                 hi!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 hi!IHAA" + "'", str1, "                                                                                                 hi!IHAA");
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "               A HI!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "     hi!                ", (java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ", (java.lang.CharSequence) "aahi######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih                                                                                                ", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  aahi4   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4   a  " + "'", str2, "hi4   a  ");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                a                  ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a                  " + "'", str2, "                a                  ");
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a##########" + "'", str1, "a##########");
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("AAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!" + "'", str1, "AAHI!");
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "...##########################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#######################################################################", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                               ", "!ih", "4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               " + "'", str3, "                               ");
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("#", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "                                                 a  aahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str2, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                               ", 638);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("A hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi!!ih" + "'", str1, "A hi!!ih");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", str1, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#######################################################################", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######################################################################" });
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################", 4, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################" + "'", str3, "######################################################################");
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########                        ", 6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#...", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi", "ahi       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                  A", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ..." + "'", str2, "       ...");
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444AAHI444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str1, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", "                                  A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444" + "'", str3, "444444");
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4hi!" + "'", str1, "a4hi!");
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "hi!", 319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                              ", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 hi!IHAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!IHAA" + "'", str1, "hi!IHAA");
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                   ", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#...", "A                                  ", "hi4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "    ", (java.lang.CharSequence) "                                                                                             4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi4                                                                                              ", "                !ih               ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4                                                                                              " + "'", str3, "hi4                                                                                              ");
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("a##########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "               a hi!        ...", (java.lang.CharSequence) "hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahia!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a4hi!", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a4hi!" + "'", str3, "a4hi!");
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                              ", "A", "ahi##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              " + "'", str3, "                                                                                              ");
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444");
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                !ih", (java.lang.CharSequence) "                                                                                                    ", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahi#####", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#######...", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    #######..." + "'", str2, "                                                                                    #######...");
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence) "aahia##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi##########", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444", strArray4, strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AHi       ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444" + "'", str9, "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##" + "'", str1, "##");
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("               A                ", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "AAHI!" });
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " #... ", (java.lang.CharSequence) "                !ih               ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a hi", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "          ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ', 9, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "aahi4!" });
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi", (java.lang.CharSequence) "hi4   a  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "a#hi!!ih################################################################################################", (java.lang.CharSequence) "##########", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", (int) (short) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              " + "'", str3, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("################################################################################################################################################################################################################################################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################" + "'", str2, "################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!IHAA", "     hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IHAA" + "'", str2, "hi!IHAA");
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", "aahi#####", "aahia##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a##########");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a##########" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("               A               ", 42, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444               A               444444" + "'", str3, "44444               A               444444");
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a#hi!!ih#################################################################################################", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#######...", 969, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str3, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                             4", 35, "               A                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             4" + "'", str3, "                                                                                             4");
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("A hi!!ih                                                                                                 ", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hi!!ih                                                                                                 " + "'", str2, "A hi!!ih                                                                                                 ");
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", (java.lang.CharSequence) "                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                     aahi!                                                     ", (java.lang.CharSequence) "                                                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                     aahi!                                                     " + "'", charSequence2, "                                                     aahi!                                                     ");
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi4                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########                        ", "######################################################################", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########                        " });
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aahi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    aahi4!" + "'", str4, "    aahi4!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                !IH                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !IH                                                                              " + "'", str2, "                !IH                                                                              ");
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444" + "'", str2, "444444");
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahia##########", "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahia##########" });
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aahi#####", (java.lang.CharSequence) "       hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  aahi4   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  AAHI4   " + "'", str1, "  AAHI4   ");
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (java.lang.CharSequence) "!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                    #######...", "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AHi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHi       " + "'", str1, "AHi       ");
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        java.lang.String[] strArray6 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "a");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "aahiaahia!!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("               #######...A#######...                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", (java.lang.CharSequence) "#...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("     hi!                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########################################A##########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("               hi!                ", 119, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                            a  aahi4", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            a  aahi4" + "'", str2, "                                                                                            a  aahi4");
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAHI##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI##########" + "'", str1, "AAHI##########");
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa####################", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "####################" });
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aahiaahia", (java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "                               ", 97, 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                         aaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "                                         aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a##########" + "'", str1, "a##########");
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aahiaahia");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################", (java.lang.CharSequence) "aahi4!", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A hi!!ih", "                                           ##########                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "               a hi!        ...    ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "               a hi!        ...    " + "'", charSequence2, "               a hi!        ...    ");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "               a hi!        ...", (java.lang.CharSequence) "ahi##########", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "    aahi4!", (java.lang.CharSequence) "", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HICLASS...", charSequence1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "4" });
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi##########");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahia!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a  aahi4", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi", "##########" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahia!" });
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "A                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("               a hi!        ...", "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!        ..." + "'", str2, "hi!        ...");
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI!ih                                                                                                 ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               A HI!               ", "                                                                                             4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                !IH                                                                              ", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", (java.lang.CharSequence) "hi!IHAA", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi!", "##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!" + "'", str2, "aahi!");
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("               a hi!               ", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               a hi!               " + "'", str2, "               a hi!               ");
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                              hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 90, (int) (byte) -1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                      ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", 111);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "         4");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                              hi!                ", (java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahia!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aahi4", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "a hi!!ih                                                                                                 ", "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;" + "'", str3, "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi##########");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "##########" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AHi############", (java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) " ##        Hi!               ", (java.lang.CharSequence) "aahi#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#####################################################ahi###############################################################", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                        ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("               a                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                a               " + "'", str1, "                a               ");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               a hi!        ...", "               A               ", "######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############a#hi!########..." + "'", str3, "###############a#hi!########...");
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#######################################################################################       hi!", (java.lang.CharSequence) "                                                        ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 94);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("              Hi!               ", "                                  A", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              Hi!               " + "'", str3, "              Hi!               ");
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##########                                            444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "...##########################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                a               ", "!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a               " + "'", str2, "                a               ");
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        char[] charArray3 = new char[] { '#' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "                                                                                             4", (int) (byte) 0, 104);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str4, "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAHI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI" });
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                               ", "", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               " + "'", str4, "                               ");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "###############a#hi!########...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AAHI!ih                                                                                                 ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aahiaahia", "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahiaahia" + "'", str2, "aahiaahia");
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi#####", "                      ##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahi##########", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "    ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", strArray3, strArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aahi!" + "'", str9, "aahi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str10, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aahi##########" + "'", str14, "aahi##########");
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                !ih               ", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih               " + "'", str2, "                !ih               ");
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        char[] charArray7 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi######", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               A                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               a                " + "'", str1, "               a                ");
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AHi       ", 31, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi       " + "'", str3, "AHi       ");
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;", 6, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;" + "'", str3, "class#[Ljava.lang.String;#######...class#[C#######...class#[Ljava.lang.String;#######...class#[Ljava.lang.String;");
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "aahi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  aahi4   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi4" + "'", str1, "aahi4");
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                    ", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("################################################################################################################################################################################################################################################################################################################################", 56, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!" + "'", str1, "aahi!");
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        char[] charArray7 = new char[] { '4', '4', 'a' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                        ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##########################################A##########################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444444444444444AAHI444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str1, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    ", "#####################################################ahi###############################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                           ##########                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                    #######...", (java.lang.CharSequence) "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ##        Hi!               ", 638, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               " + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;" + "'", str1, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "i", (java.lang.CharSequence) "##########                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a hi", 319);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             a hi                                                                                                                                                              " + "'", str2, "                                                                                                                                                             a hi                                                                                                                                                              ");
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("              Hi!               ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              Hi!               " + "'", str2, "              Hi!               ");
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               a                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###############a#hi!########...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############a#hi!########..." + "'", str1, "###############a#hi!########...");
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AHi       ", (java.lang.CharSequence) "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    aahi4!", "AAHI##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    aahi4!" + "'", str2, "    aahi4!");
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##########", "                !ih                                                                              ", "  aahi4   ", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########" + "'", str4, "##########");
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a                ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a  aahi4", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaahiaaaaaaaaaaaaaaaaa");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                        ", (int) '#', 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("               a                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" ##        Hi!               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ##        Hi!               " + "'", str2, " ##        Hi!               ");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("a hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!" + "'", str1, "a hi!");
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "                                                                                                                                                             a hi                                                                                                                                                              ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("               a                ", "                !ih               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               a                " + "'", str2, "               a                ");
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                              ", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              " + "'", str2, "                              ");
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a hi", (java.lang.CharSequence) "                !ih                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aahia!", "AAHI##########", "hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aahia!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia!" + "'", str2, "aahia!");
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 119, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#######################################################################", "a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                              hi!                ", (int) (byte) -1, "aahiaahia");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              hi!                " + "'", str3, "                                                                              hi!                ");
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aahi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi4!" + "'", str3, "aahi4!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aahia!" + "'", str5, "aahia!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aahi", "!" });
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "                        ", "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str4, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi" + "'", str4, "Hi");
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  aahi4   ", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "AHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "                                                     aahi!                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!IHAA", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IHAA" + "'", str2, "hi!IHAA");
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         aaaaaaaaaaaaaaaaaaaaaaa", "#", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                         aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                              ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 56, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi", "AHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "#");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                 hi!IHAA", "A hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hi!!ih                                                                                                 " + "'", str2, "A hi!!ih                                                                                                 ");
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a##########", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "44444               A               444444", (java.lang.CharSequence) "hi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##########", "a hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hhhhhhhhhhhhhhhhhhhhhhhh", "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########" });
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###############a#hi!########...", 638);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aahi######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                              hi!                ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", str2, "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                            a  aahi4", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#...", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "A", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("######################################################################", 111);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         ######################################################################" + "'", str2, "                                         ######################################################################");
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#...", "...##########################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                      ##########", (java.lang.CharSequence) "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                 a  aahi4", (java.lang.CharSequence) "ahi       ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "aahia##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                             4", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             4" + "'", str2, "                                                                                             4");
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###############a#hi!########...", 1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                  A");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                  ", "A" });
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi" + "'", str1, "aahi");
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                !ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               a                ", 35, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" #... ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ... " + "'", str3, "  ... ");
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                a               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", (java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "                                  A", "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#######################################################################", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                    ", 111, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    aaaaaaaaaaa" + "'", str3, "                                                                                                    aaaaaaaaaaa");
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#", "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                           ##########                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           ##########                                            " + "'", str1, "                                           ##########                                            ");
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                   ", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAHI!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               hi!                ", (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "##########################################A                                  ##########################################", (int) (byte) 0, 34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str4, "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (java.lang.CharSequence) "aahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", (java.lang.CharSequence) "aahia##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                             A HI                                                                                                                                                              " + "'", str1, "                                                                                                                                                             A HI                                                                                                                                                              ");
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                     aahi!                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     !ihaa                                                     " + "'", str1, "                                                     !ihaa                                                     ");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   " + "'", str1, "                                                                                                   ");
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AAHI!ih                                                                                                 ", "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "aahi4!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAHI", 6, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "AHi       ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "a hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str3, "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                      ##########", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "AHi       ", "aahia!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                     aahi!                                                     ", 2, "                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     aahi!                                                     " + "'", str3, "                                                     aahi!                                                     ");
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "ahi##########", "aahi######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str3, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########" + "'", str1, "#########");
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("               A                ", "A hi!!ih", 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               A                " + "'", str3, "               A                ");
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                              ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi4   a  ", 100, "aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("          ", "  hi ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "  AAHI4   ", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444", (java.lang.CharSequence) "       A                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!IHAA", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A hi!!ih                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A hi!!ih                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str5, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi##########", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...##########################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########################..." + "'", str1, "...##########################...");
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##", "##", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                 a                                                  ", (java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aahia##########", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("aahi4!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi4!" + "'", str3, "aahi4!");
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                               ", (java.lang.CharSequence) "aahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                         ######################################################################", "                a                  ", 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ######################################################################" + "'", str3, "                                         ######################################################################");
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                            a  aahi4", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            a  aahi4" + "'", str3, "                                                                                            a  aahi4");
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!" + "'", str1, "AAHI!");
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                           ##########                                            ", (int) (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           ##########                                            ###" + "'", str3, "                                           ##########                                            ###");
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "#######################################################################################       hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AHi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi" + "'", str2, "AHi");
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!IHAA", (java.lang.CharSequence) "                                                     AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI!ih                                                                                                 ", (int) ' ', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!ih", 42, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH                                                                                                 ", "Hi!", 969);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH                                                                                                 " });
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ", (java.lang.CharSequence) "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ... ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  ... " });
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               a                ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" #... ", "                                                 a  aahi4", 4, 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " #..                                                 a  aahi4" + "'", str4, " #..                                                 a  aahi4");
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("i", "                                  A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       ...", "##########                                            444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!" + "'", str3, "aahi!");
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                a               ", "                                                                                                    aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a               " + "'", str2, "                a               ");
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aahiaahia!!", 319);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444               A               444444" + "'", str1, "44444               A               444444");
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "...", (java.lang.CharSequence) "...##########################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "a hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                             A HI                                                                                                                                                              ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             A HI                                                                                                                                                              " + "'", str2, "                                                                                                                                                             A HI                                                                                                                                                              ");
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("A hi!!ih                                                                                                 ", "a hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!" + "'", str2, "a hi!");
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "                !ih                                                                              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (short) 1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "", "" });
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                              hi!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "               a                ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CL", "SS", "[lJ", "V", ".L", "NG.sTRING;CL", "SS", "[cCL", "SS", "[lJ", "V", ".L", "NG.sTRING;CL", "SS", "[lJ", "V", ".L", "NG.sTRING;" });
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                !ih                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                !ih                                                                              " + "'", str1, "                !ih                                                                              ");
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "######################################################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("aahi##########", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("##########                        ", strArray4, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               a hi!               ", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("aahi!", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "#...");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", strArray12, strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "               A HI!               ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "##########                        " + "'", str8, "##########                        ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "               a hi!               " });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str19, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str20, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                            a  aahi4", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("A hi!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A hi!!ih" + "'", str1, "A hi!!ih");
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                !ih                                                                              ", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                a               ", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a           " + "'", str2, "                a           ");
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih A" + "'", str1, "ih A");
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a##########", "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a##########" + "'", str3, "a##########");
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4", (java.lang.CharSequence) "AHi       ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                              ", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "          ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                     AAHI!                                                     ", "aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     AAHI!                                                     " + "'", str2, "                                                     AAHI!                                                     ");
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", 42, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "AHi       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A                                  ", 99, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A                                  " + "'", str3, "A                                  ");
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (int) 'a', 319);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa..." + "'", str3, "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AAHI", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI!", "               A HI!               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "                                   ", "!ih                                                                                                ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih                                                                                                 ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##########################################A##########################################", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################A##########################################" + "'", str3, "##########################################A##########################################");
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "44444444444444444444444444444444444", (java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "       A                                          ", (java.lang.CharSequence) "44444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aahi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi4!" + "'", str1, "aahi4!");
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("a4hi!", "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  hi ##########", "                !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "a#hi!!ih#################################################################################################", 78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "Hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahia!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                    aaaaaaaaaaa", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "hi!        ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "44444               A               444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaa", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", "#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                               ", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               " + "'", str3, "                               ");
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########                        ", 42, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                " + "'", str3, "##########                                ");
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A hi!!ih", "a hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("A hi", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("     hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAHI!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ih" + "'", str1, "AAHI!ih");
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahi!" + "'", str1, "Aahi!");
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                             4", "a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             4" + "'", str2, "                                                                                             4");
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aahi4!", (java.lang.CharSequence) "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "  aahi4   ", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aahi#####", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi#####" + "'", str2, "aahi#####");
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#########", "a hi", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########" + "'", str3, "#########");
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                                                                   ", (java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aahiaahia", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                             A HI                                                                                                                                                              ", "a  aahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                          ", (java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }
}

