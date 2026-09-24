package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      " + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ");
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ih", 876);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAHIAAAAAAAAAAAAAAAAA", "i ", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a", 310);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAHIAAAAAAAAAAAAAAAAA" + "'", str4, "AAAAAHIAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "HAAHI######!IHAAHI######!IAAHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...aaa                a               ...aaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaa                a               ...aaa" + "'", str3, "...aaa                a               ...aaa");
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "AAHI!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                     aahi!                                                     ", (java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "############################################ a ############################################ !ihaa !ihaa !ihaa !ihaa !ihaa !ihaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          Hi!          ...44444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                          ...", (java.lang.CharSequence) "               ...    ...A...    ...                ", 876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                         ######################################################################                                         ##############     h!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "class [L4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("A HI                                                                                                                                                                                             a hi!", 757);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A HI                                                                                                                                                                                             a hi!" + "'", str2, "A HI                                                                                                                                                                                             a hi!");
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 246);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" #..                                                 a  aahi4", "AAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aa", "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 319);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " #..                                                 a  aahi4" + "'", str4, " #..                                                 a  aahi4");
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "a##########444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 751);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                   A hi", (java.lang.CharSequence) "...class              #...class [Ljava.lang...", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) " A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                         ######################################################################                                         ##############     h!                ", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  ...                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         ######################################################################                                         ##############     h!                " + "'", str3, "                                         ######################################################################                                         ##############     h!                ");
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "#######################################################################################################################                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str2, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ", "##        H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  " + "'", str3, "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ");
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "AAAAAHIAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi4!", "HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi4!" });
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                      ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      ##########" + "'", str1, "                      ##########");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ", "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                     ahia a##########                                                                                                                                                   ", "hi!##########444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                     ahia a##########                                                                                                                                                   " + "'", str2, "                                                                                                                                                     ahia a##########                                                                                                                                                   ");
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hi!", 757);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", 110, "###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####### hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi########" + "'", str3, "####### hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi########");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ", "               a hi!        ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA", "", "", "", "", "", "", "", "", "", "", "", "", "", "#######################################################################################################################################################################################################.." });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                      ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 11, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                         a hi!               ", "                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         a hi!               " + "'", str2, "                                                                         a hi!               ");
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                        4444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                             ", 319, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                " + "'", str4, "                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "                                                                                                                                                             a hi                                                                                                                                                              ", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       #                                          ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    #                                                        " + "'", str2, "                    #                                                        ");
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "444444", charSequence1, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a hi!     ", 75, "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a hi!     ##########                                                       " + "'", str3, "a hi!     ##########                                                       ");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                a           ", "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##############################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                a           " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                .                                                                                                .                                                                                                .                                                                                                .            #######A##################################a######a#######A##################################                                                                                                .                                                                                                .                                                                                                .                                                                                                .            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                .                                                                                                .                                                                                                .                                                                                                .            #######A##################################a######a#######A##################################                                                                                                .                                                                                                .                                                                                                .                                                                                                .            " + "'", str1, "                                                                                                .                                                                                                .                                                                                                .                                                                                                .            #######A##################################a######a#######A##################################                                                                                                .                                                                                                .                                                                                                .                                                                                                .            ");
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "#################################################################aaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih" });
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "      ###aaaaaaaaaaaaaaAAHIaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444444444444444444444                                            ##########                                                                             ##########                                                     ", "", 609);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444                                            ##########                                                                             ##########                                                     " + "'", str3, "444444444444444444444444                                            ##########                                                                             ##########                                                     ");
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aahi########## #..                                                 a  aahi4", (java.lang.CharSequence) "                                                 AHI##########", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "AHI        ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AHI        AHI        hAHI        ##########", "aahi#####");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AHI        AHI        hAHI        ##########" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#################################################################################################", "hi!##########444444444444444444444444", ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hhhhhh", (-1), 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhh" + "'", str3, "hhhhhh");
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "Aahiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAHI######AHI##########AHI######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  aahi4   ", "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  aahi4   " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aahi4   " + "'", str3, "  aahi4   ");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH", 124, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH###################################" + "'", str3, "##################################AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH###################################");
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4  hi4                                                                                              ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" A               4            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "A", "               ", "4", "            " });
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "A hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("      ###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "      ", "###", "AAAAAAAAAAAAAA", "aahi", "AAAAA", "..." });
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a hi!     ##########                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               a               4               a               4               a     A HI!!IH  4               a               4               a               4               a " + "'", str1, "               a               4               a               4               a     A HI!!IH  4               a               4               a               4               a ");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...############444444444444444444444444", "  ...", "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", 83);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...############444444444444444444444444" + "'", str4, "...############444444444444444444444444");
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "AAHI!", (java.lang.CharSequence) "i ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaa", (java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi##########", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                         ######################################################################", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "h", "##########" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AHi#######AHi#######a#AHi#######AHi#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    " + "'", str1, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                 hi          !A             ", "###########################A4444444444444444444444444444444444444444444444444444  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aa", 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 hi          !A             " + "'", str4, "                 hi          !A             ");
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                               aaaaaaaaaaaaaaaaaaaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               AAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str1, "                               AAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4              hI!               44", "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4              hI!               44" + "'", str2, "4              hI!               44");
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
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
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         4", charArray10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!IH", (java.lang.CharSequence) "                                                                                                          aAHI!i                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa###########################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "class [L4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 903 + "'", int1 == 903);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hI4                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###aaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################" + "'", str2, "##############################################################################################");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...aaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#4hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4hi!" });
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", "", (-1));
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                A               ", 83, 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...class              #...class [Ljava.lang...", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                a               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########" });
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi ##########", 901, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi ##########" + "'", str3, "  hi ##########");
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "A hi");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "aahia!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                      ##########                                            " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str11, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str12, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "                                                   hi          !", "                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 792);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str4, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ahi       ", "hi4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi       " + "'", str2, "ahi       ");
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                    hi!                ", 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    hi!                " + "'", str3, "                                    hi!                ");
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                               aaaaaaaaaaaaaaaaaaaaaaaa     ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         a  aahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 78);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                               ################################################################################", "");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("444444444444444444444444                                            ##########                                                                             ##########", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", str7, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "################################################################################" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "444444444444444444444444                                            ##########                                                                             ##########" + "'", str12, "444444444444444444444444                                            ##########                                                                             ##########");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", 111);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "         4");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a hi", (java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "          ");
        boolean boolean17 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '#');
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a4hi!", strArray22, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("                !ih               ", strArray18, strArray22);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.replaceEach("aahia##########", strArray4, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str26, "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                !ih               " + "'", str27, "                !ih               ");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "aahia##########" + "'", str28, "aahia##########");
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("     h!               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                  ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  " + "'", str2, "                                                                  ");
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "           #########            ", "aHi       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("               #######...A#######...                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "               ", "#######...", "A", "#######...", "                " });
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", 3, "###aaaaaaaaaaaahi#######aaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;" + "'", str3, "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 " + "'", str1, "aAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("############################################               a               ############################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaa", " hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##########    #hi!AAAAAAAAAAAAAA", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########    #hi!AAAAAAAAAAAAAA" + "'", str2, "##########    #hi!AAAAAAAAAAAAAA");
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4  HI4                                                                                              ", (java.lang.CharSequence) "I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ihCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!ih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!ih" + "'", str2, "!ihCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!ih");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa" });
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "a hi!!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaahi!" + "'", str1, "aaaaaaaahi!");
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!4a", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a4a" + "'", str3, "a4a");
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", (java.lang.CharSequence) "       a                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                     aaaaaaaaaaaaaaaaaaaaaaaa     ", (java.lang.CharSequence) "hi!IHAA", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("           ", 0, 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           " + "'", str3, "           ");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AHi############", "444444444444444", "", 969);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AHi############" + "'", str4, "AHi############");
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi4!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA" + "'", str1, "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("a hi!!ih                                                                                                 ", "...######aahia##########aahia###...", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi######", "                                                                  ", 76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##############################################################A                                  ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { " ", "!!", "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aahi######" });
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa", (int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa");
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "                                                     aahi!                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444", "...class              #...class [Ljava.lang...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "...class              #...class [Ljava.lang...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH", strArray2, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 42 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str10, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi######!ih                                                                 ", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi######!ih                                                                 " });
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih                                                                                                 ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaa         h!                     h!                     h!                     h!                     h!                     h!                     h!                     h!                     h!                  ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                   a hi", 3, 516);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                   a hi" + "'", str3, "                                                                                                                   a hi");
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                             Hi!                                                                                                                                                               ", (java.lang.CharSequence) " #..                                                 a  aahi4 #..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 157 + "'", int2 == 157);
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!", 970, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", 249);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str2, "                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI4                                                                                                 ", 177);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                               AAAAAAAAAAAAAAAAAAAAAAAA     ", "a hi!!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               AAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str2, "                               AAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(".class [c#######...class [ljava.lang.string;#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".class[c#######...class[ljava.lang.string;#######" + "'", str1, ".class[c#######...class[ljava.lang.string;#######");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "          Hi!          ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                           A HI!        ...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                           A HI!        ..." + "'", str2, "                                                                                                                                                                                                           A HI!        ...");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########", (java.lang.CharSequence) "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   " + "'", str2, "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   ");
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;", "                                      aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils stringUtils1 = new org.apache.commons.lang3.StringUtils();
        org.apache.commons.lang3.StringUtils[] stringUtilsArray2 = new org.apache.commons.lang3.StringUtils[] { stringUtils0, stringUtils1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(stringUtilsArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) stringUtilsArray2, '4');
        org.junit.Assert.assertNotNull(stringUtilsArray2);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Ih A", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih A" + "'", str2, "Ih A");
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a                ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###AAAAAAAAAAAahi#######AAAAAAAAAAA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a...#######a...#######hi!", 928, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       a...#######a...#######hi!" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       a...#######a...#######hi!");
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih                                                                                                ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Cclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        char[] charArray8 = new char[] { '#', ' ', '4', '4', 'a' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AHI       ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       a...#######a...#######hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...HI######", "ihaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...HI######" });
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4" + "'", str2, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4");
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "           #########            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", (java.lang.CharSequence) "           !iH          ", 892);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", "A                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih" });
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "  ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 30, 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str2, "          A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "4");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#..", "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH", 5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", "#######...", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#.." });
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                !IH                                                                              ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                !ih           ", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih           " + "'", str2, "!ih           ");
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A               #               A               #               A               #               A               #               A               #               A               #               A               #               A              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A             " + "'", str1, "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A             ");
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####aahia##########aahia##########aahia#####");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####", "aahia", "##########", "aahia", "##########", "aahia", "#####" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####aahia############aahia############aahia######" + "'", str3, "#####aahia############aahia############aahia######");
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444         Hi!               ", (java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "444444444444444444444444                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaa44444               A               444444", (java.lang.CharSequence) "##hi#aaaaaaaaaa                  ", 968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                ", "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                " + "'", str2, "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                ");
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHIaaaaaa", 8, 915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str1, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...               4.STRING;C...", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...               4.STRING;C..." + "'", str3, "...               4.STRING;C...");
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("##########                                                                             ##########");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########", "                                                                             ", "##########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ih", (java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa", "4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa" + "'", str2, "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa");
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;" });
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a  aahi4", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A                                  ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", (java.lang.CharSequence[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aahi!" + "'", str10, "aahi!");
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHH...", (java.lang.CharSequence) "IH", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "aahi", 15);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################." + "'", str1, "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.");
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" ##        HI!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ##        hi!               " + "'", str1, " ##        hi!               ");
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###Hi!###" + "'", str3, "###Hi!###");
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###########################A4444444444444444444444444444444444444444444444444444  ##########################################", "#####h!###############", "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################A4444444444444444444444444444444444444444444444444444  ##########################################" + "'", str3, "###########################A4444444444444444444444444444444444444444444444444444  ##########################################");
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                   !iH        ##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH        ##" + "'", str1, "!iH        ##");
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Aahi!!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "               hi!                ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                      ########## 444444444444444444444444                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      444444444444444444444444 ##########                                      " + "'", str1, "                                      444444444444444444444444 ##########                                      ");
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) '#', "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               4A               4  " + "'", str3, "               4A               4  ");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                              hi!                ", "AAHI######!IH                               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              hi!                " + "'", str2, "                                                                              hi!                ");
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "aAHI######aaaaaaaaaaaaaaAAHIaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAA ########## #########", (int) (short) 10, "aaaaaaaaaaaaaaaaaaaaaaaa####################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                !ih                ", (int) (short) 1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                !ih                " + "'", str3, "                !ih                ");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("##################################AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH###################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##################################AAHI######!IH", "AAHI######!IH", "AAHI######!IH", "AAHI######!IH###################################" });
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                      ########## 444444444444444444444444                                      ", "               A               ", (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 A                 " + "'", str3, "                 A                 ");
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A HI!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!    " + "'", str1, "A HI!    ");
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "AHI##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str2, "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LASS[LJAVA.LANG.STRING;HICLASS[LJAVA.LANG.STRING;CLASS[CCLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;HI" + "'", str1, "LASS[LJAVA.LANG.STRING;HICLASS[LJAVA.LANG.STRING;CLASS[CCLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ihaa", 751, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" aH", "AHI        AHI        hAHI        ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aH" + "'", str2, " aH");
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    " + "'", str3, "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ", "", "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "Aahi######ahi##########ahi##########ahi##########ahi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa                                                     ", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                               ################################################################################", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                              a                                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                              ", "a", "                                               " });
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAHI4                                                                                              ", "AAHI######AHI##########AHI######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI4                                                                                              " + "'", str2, "AAHI4                                                                                              ");
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 ", "", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 " + "'", str3, "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...               4.STRING;C...", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("               4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               ", 326, 250);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "haaaaaaaaa", (java.lang.CharSequence) "########## 444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a", (java.lang.CharSequence) "a#hi!!ih################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AAHIAAAAAAAAAAAAA######################################################################", (java.lang.CharSequence) "#######################################################################################       hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#######...A#######...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih a                                                                                                                                                                                             IH A" + "'", str1, "!ih a                                                                                                                                                                                             IH A");
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!", "                         A                                  A         aH                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!" });
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S");
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              " + "'", str1, "              ");
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                                            AA", "... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                            AA" + "'", str2, "                                                                                                            AA");
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  AAHI4  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4" + "'", str1, "AAHI4");
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     H!                     ", (java.lang.CharSequence) "hi##########hi####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Class<?>[]) classArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, "Hi!IHAA", 915, 903);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                               #...", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaahiaaaaaaaaaaaaaaaaa");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "4IHAA");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("aa4!", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aaaaahiaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaaahiaaaaaaaaaaaaaaaaa" + "'", str12, "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aa4!" + "'", str13, "aa4!");
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", 326, "aHi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aHi", " ##        Hi!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                 " });
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH                                                                                                 ", "44444444");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH                                                                                                 " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA" + "'", str6, "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "a4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "          ", (java.lang.CharSequence) "aahi4!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ahi       ", 167, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ", 223, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aahi#...", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi#..." + "'", str3, "  hi#...");
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                hi!", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                hi!" + "'", str2, "                                                                                                hi!");
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...AAAAAAA");
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", 50, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "#######################################################################################################################                                                                                                                                   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a hi!        ...", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        java.lang.CharSequence charSequence1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ", "  ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence1, (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "########## 444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aih                                                                                                 ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aih                                                                                                 " + "'", str3, "aih                                                                                                 ");
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a", 609, "                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("a hi!!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!!ih                                                                                                 " + "'", str1, "a hi!!ih                                                                                                 ");
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                      ##########", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################" + "'", str3, "################################");
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########");
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aIH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "  ... ", (java.lang.CharSequence) "AAHI######AHI##########AHI######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!IHAA", (java.lang.CharSequence) "44444               a               444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                               #... ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#..." });
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "ih A", (java.lang.CharSequence) "                                #               a                #                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", 31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 32, 969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("CCCCCCCCCCCCCCCCCCCCC!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CCCCCCCCCCCCCCCCCCCCC!ih" + "'", str1, "CCCCCCCCCCCCCCCCCCCCC!ih");
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a hi!     ", charSequence1, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "a##########44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           ##########                                            ###", "                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ##########                                            ###" + "'", str2, "                                           ##########                                            ###");
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahi!", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "#...");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahia##########", "##########                                                                             ##########", 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahia" });
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                            ", (java.lang.CharSequence) "444444444444444444444444####################", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaa                                                                                                 hi!IHAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("s", "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s" + "'", str2, "s");
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444", (java.lang.CharSequence) "                 hi          !A             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ##########                                            " + "'", str2, "                                           ##########                                            ");
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("a#hi!!ih################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#hi!!ih################################################################################################" + "'", str1, "a#hi!!ih################################################################################################");
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi" });
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                                          hi", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Hi!          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("AHi#######AHi#######a#AHi#######AHi#######", "4IHAA", "           #########            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...", "       A                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ..." + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...");
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                     hi!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("               4A               4  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               4A               4  " + "'", str1, "               4A               4  ");
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("#...", "               a hi!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "", (java.lang.CharSequence) "hi4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;", (java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "A hi!!ih                                                                                                                   AAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                 hi          !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                      aaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "a hi", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               AHi############                                ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#...", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                             4", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                               AHi############                                ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI!ih                                                                                                 ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                 hi          !A             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                        ", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS ", 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H", 901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "a hi!!ih                                                                                                                   AAHI!");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A HI!", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("          ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach(".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", strArray14, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 ", strArray5, strArray14);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!", '#');
        int int24 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A                                  ", (java.lang.CharSequence[]) strArray23);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray23, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("AAHI######!IH                                                                 AAHI######!IH", strArray5, strArray26);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih" + "'", str15, "!ih");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", str18, ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                 " + "'", str19, "                                                                 ");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH" + "'", str27, "AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!IHAA                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!IHAA                         " + "'", str2, "HI!IHAA                         ");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#######...", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...    ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "A HI!!IH                                                         ...", 757);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi#...", "       #HI#!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi", "..." });
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "            !ih                                                                 ", (java.lang.CharSequence) "ahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aaa#aaa#");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "            !ih                                                                 " + "'", charSequence2, "            !ih                                                                 ");
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#######################################################################################################################################################################################################..", "               a hi!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                a                  ", "hi4", "########## 444444444444444444444444", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                a                  " + "'", str4, "                a                  ");
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AHi############", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############" + "'", str2, "AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", 63);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " });
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                   A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("     a4hi!     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     a4hi!     " + "'", str2, "     a4hi!     ");
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4     4IH4     ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAHI######!IH                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                               ..." + "'", str1, "AAHI######!IH                               ...");
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "           #########            ", (java.lang.CharSequence) "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 864 + "'", int1 == 864);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aAHI", "Ih A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih A" + "'", str2, "Ih A");
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                   ...", "                !ih           ", 76);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "..." });
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a hi!        ...    ", (java.lang.CharSequence) "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) " #..                                                 a  aahi4", (java.lang.CharSequence) "HI!IHAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "ahi!aaahi!a", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                #               a                #                                 ", (java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                      444444444444444444444444 ##########                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" ##        Hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               !iH        ## " + "'", str1, "               !iH        ## ");
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A               #               A               #               A               #               A               #               A               #               A               #               A               #               A             ", "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A", "A", "A", "A", "A", "A", "A", "A" });
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444", "a hi!", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####", (java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####" + "'", charSequence2, "aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####");
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########    #hi!AAAAAAAAAAAAAA", "AAHI!i", 54);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########    #h", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (java.lang.CharSequence) "##########aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a hi", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "          ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "    ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi#####", strArray5, strArray11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "                                                   hi          !", 64, 15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aahi!" + "'", str14, "aahi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "aahi#####" + "'", str15, "aahi#####");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("s44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A4CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s" + "'", str2, "s");
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aahi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A hi", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                             4", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih                                                                                                 ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ihCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC!ih", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########", (java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("######################################################444444444444444444444444", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################444444444444444444444444" + "'", str3, "######################################################444444444444444444444444");
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                   ahi                                                                                                   ", ".string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   ", ".string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang." });
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4     4IH4     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###############a################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###############a################" });
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################################################" + "'", str1, "##############################################################################################");
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                    ", "AAHI4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                    " });
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444" });
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaa         h!                     h!                     h!                     h!                     h!                     h!                     h!                     h!                     h!                  ", (java.lang.CharSequence) "###############a################aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4     4ih4     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih                                                                                                ", "  ahia a##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################################################################################################################################################################################################################################################################################################################", "       hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a", 234, 761);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                 hi!!ih A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!ih A" + "'", str1, "hi!!ih A");
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...##########################...", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################..." + "'", str2, "#####################...");
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                                                        ", "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "aaaaahiaaaaaaaaaaaaaaaaa");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aHi       ", strArray5, strArray13);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray13);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("##########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ", strArray13, strArray19);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                        " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                        " + "'", str6, "                                                        ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "aHi       " + "'", str14, "aHi       ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              " + "'", str20, "aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ");
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", (java.lang.CharSequence) "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...aaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaa#######################################################################aaaaaaaaaaaaa" + "'", str1, "...aaa#######################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 985);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi", (java.lang.CharSequence) "...               4.string;c...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("################################", "44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", 157, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih" + "'", str3, "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!ih#                                                                             a#hi!!ih#a" + "'", str2, "hi!!ih#                                                                             a#hi!!ih#a");
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "####aahia##########aahia##########aahia####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "#####################################################ahi###############################################################", (java.lang.CharSequence) "aaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...hhhhhhhhhhhhhhhhhhhhh.......", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...hhhhhhhhhhhhhhhhhhhhh......." });
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("CLASS[cCLASS[lJAVA.LANG.sTRING;", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS[cCLASS[lJAVA.LANG.sTRING;" + "'", str2, "CLASS[cCLASS[lJAVA.LANG.sTRING;");
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "##########################################                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AAHI!", 78, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi", "444444444444444444444444444444444444444444", 31);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", 58, 309);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 58 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi" + "'", str6, "Hi");
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa#", (java.lang.CharSequence) "                                                                                                 hi!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AHi", "##        H");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AHi" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str1, "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "####AAHIA##########AAHIA##########AAHIA#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "AAHhI   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "##        H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "44", (java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Ahi!!ih44444444444444444444444444444444", "AA######################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!!ih44444444444444444444444444444444" });
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa");
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "Aahi!!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAHI!", 55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA", 83);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            " });
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HHHHHHHHHHHHHHHHHHHHH...", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHH..." + "'", str2, "HHHHHHH...");
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa##hi hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str2, "aaaaaa##hi hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A hi!!ih                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                           aaaaaaaaaaaaaa aaaaaaaaaaaaaa                                                                            ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A hi!!ih                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "A hi!!ih" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("              Hi!               ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "#######..", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##############################################################A                                  ", (java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########", "  aaaaaaaaaaaaaaaaaaaaaaaaaaa   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########" + "'", str2, "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence7 = null;
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny(charSequence7, charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                 a  aahi4", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4a###############4###############a###############4#######        a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 928);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4hi!444hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi!444hi!4" + "'", str1, "4hi!444hi!4");
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                            a  aahi", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI!ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                                         #####################################################################", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih", (java.lang.CharSequence) "Ahi##########HI", 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAHI", 15, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI44444444444" + "'", str3, "AAHI44444444444");
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                                              hi!                ", (java.lang.CharSequence) "a##########44444444444444444444444444444444444444444444444444444444", 903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 269);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("            !ih                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                hi!            " + "'", str1, "                                                                                                hi!            ");
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA...", 915, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       " + "'", str2, "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaahi!", 9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A                              A                              A                              A                              A                              A                              A                              A                              A                              A                              A               " + "'", str2, " A                              A                              A                              A                              A                              A                              A                              A                              A                              A                              A               ");
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                        ", (java.lang.CharSequence) "             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "             " + "'", charSequence2, "             ");
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAAAAAAAAAAAAAAAAAAAA ########## #########", "####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       ...", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A                                  A         aH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "##########################################################################################################################hi!...##########################################################################################################################", (java.lang.CharSequence) "!ih                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4              hI!               44", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 8);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4              hI!               44" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4              hI!               44" + "'", str4, "4              hI!               44");
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence[]) strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray4, strArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str14, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444s" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444s");
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIAAAAAAAAAAAAA#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "AAHIAAAAAAAAAAAAA#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "A HI                                                                                                                                                                                             a hi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", (java.lang.CharSequence) "4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("AAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIAAAAAAAAAAAAA######################################################################" + "'", str1, "AAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##########                                                                             ##########", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA", "a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA" + "'", str2, "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA");
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAA", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "a4hi!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                       " + "'", str1, "                                                       ");
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "       hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "     h!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ", 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aAHI!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!IHAa" + "'", str1, "i!IHAa");
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" #..                                                 a  aahi4", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #..                                                 a  aahi4" + "'", str2, " #..                                                 a  aahi4");
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("    aahi4!", "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "  hi ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahi4", 32, 767);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("      ", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################.." + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" A                              A                              A                              A                              A                              A                              A                              A                              A                              A                              A               ", 661, 59);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ...", (int) (short) 100, 864);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!..." + "'", str1, "hi!...");
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("######################################");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "######################################" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", (java.lang.CharSequence) "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 78);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", str5, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", str7, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaa", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AIH                                                                                                 ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("aahia!", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!" + "'", str2, "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;", 310, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            " + "'", str1, "            ");
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...aaaaaaaaaaa                     hi!...", (java.lang.CharSequence) "               A HI!               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ", 76, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("..#######################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..#######################################################################################################################################################################################################" + "'", str1, "..#######################################################################################################################################################################################################");
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaa          aaaaa", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAHI!ih", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                  AAHI!ih" + "'", str2, "                                                                                                                                                                                                  AAHI!ih");
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhh", "!IH", 99);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4ihaa  a");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hhhhhh" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hhhhhh" + "'", str5, "hhhhhh");
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", 928, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", (java.lang.CharSequence) "               a               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!IH", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                      ###############a################                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##########################################                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                                                                                                                                                                                                                                  ###############a################                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############a################" + "'", str1, "###############a################");
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "               A                ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "                                           ##########                                            ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!", strArray5, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "aHi");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "hhhhhh", 892);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("a##########444444444444444444444444444444444444444444444444444444444", strArray14, strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!" + "'", str12, "Hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a##########444444444444444444444444444444444444444444444444444444444" + "'", str19, "a##########444444444444444444444444444444444444444444444444444444444");
    }
}

