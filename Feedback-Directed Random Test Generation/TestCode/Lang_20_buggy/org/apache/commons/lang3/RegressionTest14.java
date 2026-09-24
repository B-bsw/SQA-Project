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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Ih A", "ahi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih A" + "'", str2, "Ih A");
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                                                                                                              HI4                                                                                                                                                              ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", "#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###" + "'", str2, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########################################a                                  ##########################################", (java.lang.CharSequence) "                                                                                                                                                                           Hi!", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                         ##########", (int) ' ', 694);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         ##########" + "'", str3, "                         ##########");
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Aaaaaaaaaaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###AAAAAAAAAAAAAAaahiAAAAA...", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#..                                                 a  aahi4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###AAAAAAAAAAAAAA", "hiAAAAA..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA..." + "'", str4, "###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA...");
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...               4.string;c...", "          aaaaa", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 792 + "'", int1 == 792);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                     aaaaaaaaaaaaaaaaaaaaaaaa     ", "##########                        ##########      a4hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                     aaaaaaaaaaaaaaaaaaaaaaaa     " });
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...                             ##########", "                                       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                         ######################################################################", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 78 + "'", int1 == 78);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    ", 319, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ", "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ");
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                  ", "#####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  " + "'", str2, "                                                  ");
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ", 928);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        ", "44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  ... ", "Hi!IHAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  ... " });
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "##########                                                                             ##########", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "Ahi!!ih", (java.lang.CharSequence) "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...", 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str3, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4444444444444444444444444444444444444444444444444444444444444444444444444444 a", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 a" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "aahi4!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "               A               ", 15, 0);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "A", "" });
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     " + "'", str2, "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ");
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("class [L", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [L" + "'", str2, "class [L");
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa                                                     ", "I", "Ih A");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH" + "'", str1, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH");
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" s ", "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA", 104);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " s " });
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                   a hi", "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" HI4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI" + "'", str1, " HI");
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi!", (java.lang.CharSequence) "#..                                                 a  aahi4", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aa", 219);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", 76, 928);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                           Hi!", (java.lang.CharSequence) "                                                                                                 HI!ihaa", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 77 + "'", int3 == 77);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "hi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!IH" + "'", str1, "HI!IH");
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444444444444", "                                                     ##########                                                                             ##########                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                        ", (java.lang.CharSequence) "hi!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a hi!!ih                                                                                                                   AAHI!                                                     ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!!ih                                                                                                                   AAHI!                                                     " + "'", str2, "a hi!!ih                                                                                                                   AAHI!                                                     ");
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######" + "'", str1, "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######");
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "444", (java.lang.CharSequence) "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, (java.lang.CharSequence) "AHi############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "hi##########hi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A" });
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..", 326);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################.." + "'", str2, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahi4!", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                 hi          !A             ", (java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", 757);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " ", 638, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI" });
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                           A HI!        ...", "aahi######!ih                                                                 ", 5, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ..." + "'", str4, "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...");
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########", "aahi4", 31);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444" + "'", str2, "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444");
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " });
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#######...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                444", 18, 969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "", "", "", "", "", "", "", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4ihaa  a", "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4ihaa  a" });
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("  ...                                                                              ", "HI!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ...                                                                              " + "'", str2, "  ...                                                                              ");
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", 319, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", (java.lang.CharSequence) "AHI##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...##########" });
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!aaahi!a", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!IH", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Hi!IHAA");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ahi!aaahi!a" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "ahi!aaahi!a" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "ahi!aaahi!a" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ahi        ", "       iHA       iHA#a#      iHA       iHA", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "haaaaaaaaa" + "'", str3, "haaaaaaaaa");
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#############################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                 " + "'", str2, "                                                                                                                                                                                 ");
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi4                                                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "4", "                                                                                              " });
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("               a hi!        ...    ", "hi##########hi####", "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", 876);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               a hi!        ...    " + "'", str4, "               a hi!        ...    ");
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "                                                                                    #######...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444               A               444444", (java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a hi", "4ihaa  a");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "" });
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                  ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                     !ihaa                                                     ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "           #########            ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "aaaaaaaaaaaaaa                                                                                                 hi!IHAA");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "##H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4hi!444hi!4", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!444hi!4" + "'", str3, "4hi!444hi!4");
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 151);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                       " + "'", str2, "                                                                                                                                                       ");
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", (java.lang.CharSequence) "               aAa                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Aahi#####", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aahi" + "'", str2, "Aahi");
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  ...", "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ..." + "'", str2, "  ...");
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444" + "'", str1, "44444444444444444444444444444");
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4                                                                                              ", (java.lang.CharSequence) "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "###############a#hi!########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##############################################################################", "aahi#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4hi!444hi!4", "                !ih                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!444hi!4" + "'", str2, "4hi!444hi!4");
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a hi!        ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "              Hi!               ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                     !ihaa                                                     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                        4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "                      ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                          h" + "'", str1, "                                                                                                          h");
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a" + "'", str1, "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a");
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa");
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("I", 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                             Hi!                                                                                                                                                               ", strArray7, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "A hi");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "....................................................................................#######...", (java.lang.CharSequence[]) strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("               hi!                ", strArray12, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4', 0, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str13, "                                                                                                                                                             Hi!                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               hi!                " + "'", str19, "               hi!                ");
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                a           ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######################################################################################################################################################################################################..", "                                                     ##############################################################A                                                             ...", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", "AHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("class [L", "44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [L" + "'", str2, "class [L");
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                    aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4" + "'", str2, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4");
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       iHA       iHA#a#      iHA       iHA", 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       A                                  a      a       A                                  " + "'", str2, "       A                                  a      a       A                                  ");
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  ahia a##########", "                                                                         a hi!               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4  hi4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4  HI4                                                                                              " + "'", str1, "4  HI4                                                                                              ");
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAA####################", "     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA####################" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA####################");
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AHI", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA" + "'", str2, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aAHI#####", 901);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 97, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "##########aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) " #... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###############a################", 0, "aaaaaaaaaaaaaaaaaaaaaaaa                                          aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                          aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############a################" + "'", str3, "###############a################");
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                !ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A     ", 119);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("A HI!!IH                                                                                                                   aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!!IH                                                                                                                   aahi!" + "'", str1, "A HI!!IH                                                                                                                   aahi!");
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", "##########    #hi!AAAAAAAAAAAAAA", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a" });
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI4                                                                                                 ", "hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI4                                                                                                 " + "'", str2, "HI4                                                                                                 ");
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("##########################################A                                  ##########################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "A hi!!ih                                                                                                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 83, 319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 83 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########################################", "A", "                                  ", "##########################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########################################", "", "", "##########################################" });
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "ih", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaa...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                           ##########                                            " });
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                 ", "CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA", 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                 " });
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 915, 34);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###AAAAAAAAAAAahi#######AAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAHI#######AAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAHI#######AAAAAAAAAAA");
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "               a               ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aAHI!i", (java.lang.CharSequence) " HI4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aAHI!i" + "'", charSequence2, "aAHI!i");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ", (java.lang.CharSequence) "##################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("CLASS [L", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [L" + "'", str2, "CLASS [L");
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "              hI!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################" + "'", str1, "#############################################################");
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##hi#aaaaaaaaaa                  ", "                                                                  ", "aahi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("CLASS [cCLASS [lJAVA.LANG.sTRING;", "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A hi!!ih                                                                                                 ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("####aahia##########aahia##########aahia#####", "  ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A" + "'", str1, "4A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A44A4A4A4A4A4A4A4A4A4A4A4A4A4A");
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("A HI!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!" + "'", str1, "A HI!");
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("A HI!", "AAHI######!IH                                                                 AAHI######!IH", " hi!!ih                                                         ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  i! " + "'", str3, "  i! ");
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", 219);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                             a hi                                                                                                                                                              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", 4, 901);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                             ", "a", " ", "hi", "                                                                                                                                                              " });
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                   A", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "       ..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "       ..." + "'", str5, "       ...");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str2, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                     aaaaaaaaaaaaaaaaaaaaaaaa     ", 174, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "Aahi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#######a                                  ##########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################                                  a#######" + "'", str1, "##########################################                                  a#######");
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################", (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aHi       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AHi       AHi      #a#AHi       AHi       ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi       AHi      #a#AHi       AHi       " + "'", str2, "AHi       AHi      #a#AHi       AHi       ");
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", (java.lang.CharSequence) "                               AHi############                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58 + "'", int2 == 58);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa", "aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               AHi############                                ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "               A               ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', 31, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaa     ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 87");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               ", "A", "Hi", "############", "                                " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI", "aaaaaaaaaaaaa", "######################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI!ih                                                                                                 ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "               4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               ", (java.lang.CharSequence) "              hI!               ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi" + "'", str1, "ahi");
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AHI", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 180, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#..                                                 a  aahi4", "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                                                 a  aahi4" + "'", str2, "..                                                 a  aahi4");
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4" });
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########" + "'", str1, "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    aahi4!", "#");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    aahi4!" + "'", str4, "    aahi4!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "    aahi4!" + "'", str6, "    aahi4!");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "ahi", (java.lang.CharSequence) "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                              ", "A hi!!ih                                                                                                                   AAHI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##################", "       #hi#!", "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class", 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################" + "'", str4, "##################");
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4  HI4                                                                                              ", (java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!", 903);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  ahia a##########", "                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ahia a##########" + "'", str2, "  ahia a##########");
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                a           ", (java.lang.CharSequence) "                                                     aahi!                                                     ", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) " A", (java.lang.CharSequence) "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#...", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########                        ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       A                                          ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "a hi!!ih AAHI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                 hi!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                a           ", 68, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################                a           ####################" + "'", str3, "####################                a           ####################");
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A hi!!ih                                                                                                 ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a hi!!ih", 5, "ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a hi!!ih" + "'", str3, "a hi!!ih");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                     aahi!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ..." + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("              hi!              ", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              hi!              " + "'", str2, "              hi!              ");
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##hi#aaaaaaaaaa                   ", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...#######A...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa##hi4hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "aaaaaa##hi4hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                               #...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A HI!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A", "HI!" });
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "          ", (java.lang.CharSequence) "                     hi!...", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                            ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                                                        ##########                                            ###                                                                                                              ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                            " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "  aahi4   ", 319);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i", "hI!", "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i" + "'", str3, "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i");
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444 A 444444", "4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A 444444" + "'", str2, " A 444444");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 968 + "'", int1 == 968);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#A#", 970, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang." + "'", str3, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.");
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        char[] charArray7 = new char[] { ' ', '4', 'a', 'a' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) " s ", 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "                                       ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" });
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;" + "'", str2, "ASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a", "", (-1));
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hi!", (int) (short) 1, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray4, strArray8);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "HI");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                                                          aHi       ", "hi##########hi####");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###############a#hi!########...", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                              ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...       aaaaaaaaaaaaaa...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a4!", " A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaa     ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "     " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "" });
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhh", "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "##########################################A                                  ##########################################", (java.lang.CharSequence) "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                               aaaaaaaaaaaaaaaaaaaaaaaa      ", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "       hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        hI!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        hI!");
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "                                                                                                 hi!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str2, "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "", "hi4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a hi!!ih                                                                                                 ", "                                                                                                                         ", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a hi!!ih                                                                                                 " });
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                !IH                                                                              ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "!", "IH", "                                                                              " });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", 638);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaa          aaaaa", "  hi ##########", 969);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaa          aaaaa" });
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444444444444444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 A" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444 A");
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4                                                                                              ", (java.lang.CharSequence) "                                !ih                                !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444AAHIaaaaaaaaaaaaa#####################################################################4444444", (int) (short) 100, 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...    ...", "aaaaaaaaaaaaaaaaaaaaaaaa####################", "aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ..." + "'", str3, "...    ...");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!" + "'", str2, "H                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!");
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                !ih               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Class<?>[]) classArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) classArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, "       ...", (int) (byte) 1, (-1));
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[]) classArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Class<?>[]) classArray1);
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #ahI!AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #ahI!AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a" + "'", str1, "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #ahI!AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a");
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a hi!     ", "4              hI!               44", (-1));
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "i" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a", "i" });
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########                                ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaa", 0, "                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "               A HI!               ", (java.lang.CharSequence) "                                                                                                                                                             a hi                                                                                                                                                              ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AAAAAHIAAAAAAAAAAAAAAAAA", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                !ih                                                                              ", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;" });
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAA####################", 1, "Aahi#####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA####################" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAA####################");
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray3 = new java.lang.CharSequence[][][] { charSequenceArray0, charSequenceArray1, charSequenceArray2 };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray7 = new java.lang.CharSequence[][][] { charSequenceArray4, charSequenceArray5, charSequenceArray6 };
        java.lang.CharSequence[][][][] charSequenceArray8 = new java.lang.CharSequence[][][][] { charSequenceArray3, charSequenceArray7 };
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray10 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray11 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray12 = new java.lang.CharSequence[][][] { charSequenceArray9, charSequenceArray10, charSequenceArray11 };
        java.lang.CharSequence[][] charSequenceArray13 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray16 = new java.lang.CharSequence[][][] { charSequenceArray13, charSequenceArray14, charSequenceArray15 };
        java.lang.CharSequence[][][][] charSequenceArray17 = new java.lang.CharSequence[][][][] { charSequenceArray12, charSequenceArray16 };
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray19 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray21 = new java.lang.CharSequence[][][] { charSequenceArray18, charSequenceArray19, charSequenceArray20 };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray25 = new java.lang.CharSequence[][][] { charSequenceArray22, charSequenceArray23, charSequenceArray24 };
        java.lang.CharSequence[][][][] charSequenceArray26 = new java.lang.CharSequence[][][][] { charSequenceArray21, charSequenceArray25 };
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray28 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray30 = new java.lang.CharSequence[][][] { charSequenceArray27, charSequenceArray28, charSequenceArray29 };
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray32 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray33 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray34 = new java.lang.CharSequence[][][] { charSequenceArray31, charSequenceArray32, charSequenceArray33 };
        java.lang.CharSequence[][][][] charSequenceArray35 = new java.lang.CharSequence[][][][] { charSequenceArray30, charSequenceArray34 };
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray38 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray39 = new java.lang.CharSequence[][][] { charSequenceArray36, charSequenceArray37, charSequenceArray38 };
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray41 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] {};
        java.lang.CharSequence[][][] charSequenceArray43 = new java.lang.CharSequence[][][] { charSequenceArray40, charSequenceArray41, charSequenceArray42 };
        java.lang.CharSequence[][][][] charSequenceArray44 = new java.lang.CharSequence[][][][] { charSequenceArray39, charSequenceArray43 };
        java.lang.CharSequence[][][][][] charSequenceArray45 = new java.lang.CharSequence[][][][][] { charSequenceArray8, charSequenceArray17, charSequenceArray26, charSequenceArray35, charSequenceArray44 };
        java.lang.String str46 = org.apache.commons.lang3.StringUtils.join(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertArrayEquals(charSequenceArray1, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertArrayEquals(charSequenceArray2, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertArrayEquals(charSequenceArray4, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertArrayEquals(charSequenceArray5, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertArrayEquals(charSequenceArray6, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertArrayEquals(charSequenceArray9, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertArrayEquals(charSequenceArray10, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertArrayEquals(charSequenceArray11, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertArrayEquals(charSequenceArray13, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertArrayEquals(charSequenceArray14, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertArrayEquals(charSequenceArray15, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertArrayEquals(charSequenceArray18, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertArrayEquals(charSequenceArray19, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertArrayEquals(charSequenceArray20, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertArrayEquals(charSequenceArray22, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertArrayEquals(charSequenceArray23, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertArrayEquals(charSequenceArray24, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertArrayEquals(charSequenceArray27, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertArrayEquals(charSequenceArray28, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertArrayEquals(charSequenceArray29, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertArrayEquals(charSequenceArray31, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertArrayEquals(charSequenceArray32, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertArrayEquals(charSequenceArray33, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertArrayEquals(charSequenceArray36, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertArrayEquals(charSequenceArray37, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertArrayEquals(charSequenceArray38, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertArrayEquals(charSequenceArray40, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertArrayEquals(charSequenceArray41, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertArrayEquals(charSequenceArray42, new java.lang.CharSequence[][] {});
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray45);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ih A", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 310 + "'", int2 == 310);
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               a                ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                hi!", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         4", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("H  HH! 4", "                                                                                                 HI!ihaa", "hi4   a  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!IHAA", "...                             ##########", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IHAA" + "'", str3, "!IHAA");
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                            a  aahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            a  aahi" + "'", str1, "                                                                                            a  aahi");
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################", 10, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                  aaaaaaaaaaaaaa", (java.lang.CharSequence) "4IHAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################################################################", (java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "                                                                                            a  aahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                                          hi", 928);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAA", 20, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...AAAAAAA" + "'", str3, "...AAAAAAA");
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("           !iH          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           !iH          " + "'", str2, "           !iH          ");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "##############################################################A                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "  ... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str1, "      AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                         ######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         ######################################################################" + "'", str1, "                                         ######################################################################");
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                         4IHAA", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         4IHAA" + "'", str2, "                                                                         4IHAA");
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("A hi!!ih", "4IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                     aa                                                     ", "Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!Ahi##########HI!A#A#", 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     aa                                                     " + "'", str3, "                                                     aa                                                     ");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA", 111);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA" + "'", str2, "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("a hi!!ih                                                         ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!!ih                                                         ..." + "'", str2, " hi!!ih                                                         ...");
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", "44444444", " #... ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "H", (java.lang.CharSequence) "  AAHI4   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                !ih                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                !IH                                                                              " + "'", str1, "                !IH                                                                              ");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               a                ", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("               hi!                ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, " hi!!ih                                                         ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                 ", (java.lang.CharSequence) "                                                                   ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      " + "'", str2, "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ");
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("     h!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     h!               " + "'", str1, "     h!               ");
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                 hi          !", 44, "aahi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahiaah                 hi          !aahiaah" + "'", str3, "aahiaah                 hi          !aahiaah");
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi#ahi#ahi#ahi#aahi", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ahi#ahi#ahi#ahi#aahi" });
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                           ", (java.lang.CharSequence) "Ahi##########HI!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#...", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                             4", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("CLASS[lJAVA.LANG.sTRINGNG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLAaaaaaaaaaaaaaaaaaaaaaaaCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA", 124);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA" + "'", str2, "A.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AHI##########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '4');
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence[]) strArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray11, strArray15);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#..", strArray4, strArray15);
        java.lang.Class<?> wildcardClass23 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "    " + "'", str6, "    ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "a" + "'", str18, "a");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a" + "'", str20, "a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str21, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#.." + "'", str22, "#..");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aahia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIA!" + "'", str1, "AAHIA!");
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aahi######ahi##########ahi######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######AHI##########AHI######" + "'", str1, "AAHI######AHI##########AHI######");
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!" + "'", str1, "ahi!");
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "####################                a           ####################", 55, 970);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444444444444444444", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        ", "a hi!!ih                                                                                                                   AAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 609 + "'", int2 == 609);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 516);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "aahi!", (java.lang.CharSequence) "...##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[" + "'", str1, "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[");
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", "                              ", "                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi" + "'", str3, "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########                                ", "", 99);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 516, 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########                                " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        char[] charArray8 = new char[] { '4', '4', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!IHAA", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 a                                                  ", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ", "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A " });
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaa", "#..                                                 a  aahi4", 250);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) " A 444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##hi#aaaaaaaaaa", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "##        Hi!", 319);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##hi#aaaaaaaaaa" + "'", str4, "##hi#aaaaaaaaaa");
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "....................................................................................#######...", "aAHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence1, charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##hi#aaaaaaaaaa                  ", "              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi#aaaaaaaaaa    " + "'", str2, "##hi#aaaaaaaaaa    ");
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aa" + "'", str1, "AAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aaAAaI!aa");
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        char[] charArray9 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            a  aahi4", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################" + "'", str1, "#######################################################################");
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("AHI       #######################################################################################", "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence0, (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI4                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4" + "'", str1, "HI4");
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4hi!444hi!4", "##hi#aaaaaaaaaa    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4", "!444", "!4" });
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAHI4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4" + "'", str1, "AAHI4");
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("class [Cclass [Ljava.lang.String;", "4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Cclass [Ljava.lang.String;" + "'", str2, "class [Cclass [Ljava.lang.String;");
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444AAHI444444444444444444444444", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI" + "'", str3, "AAHI");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aa", (java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########" });
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444               A               444444", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhh", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 903, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aahiaahia", "hi######!ih                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahiaahia" + "'", str2, "aahiaahia");
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", 31, "....................................................................................#######...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!" + "'", str3, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", (java.lang.CharSequence) "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!iAAHI!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "HICLASS...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(charSequence0, (java.lang.CharSequence) "                               aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                               aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", charSequence2, "                               aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" s ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " s " + "'", str2, " s ");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 638, "  ...                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                             aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "  ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                             aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               a                ", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a hi!!ih                                                         ...", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###AAAAAAAAAAAAAAaahiAAAAA...", "aahia##########aahia####", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAAAAAAAAAAAAAaahiAAAAA..." + "'", str3, "###AAAAAAAAAAAAAAaahiAAAAA...");
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AHI       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AHI       " });
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                         ######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         ######################################################################" + "'", str1, "                                         ######################################################################");
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("      ###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      ###aaaaaaaaaaaaaaAAHIaaaaa..." + "'", str1, "      ###aaaaaaaaaaaaaaAAHIaaaaa...");
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aahi##########", " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi##########" + "'", str2, "aahi##########");
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("          aaaaa", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          aaaaa" + "'", str2, "          aaaaa");
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA                                                                ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaa44444               A               444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aIH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aIH" + "'", str1, "aIH");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaa", (java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaa" + "'", charSequence2, "aaaaaaaaa");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#..", (java.lang.CharSequence) "                                                     !ihaa                                                     ", 694);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "       hi!", (java.lang.CharSequence) "aahi######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##############################################################################", (java.lang.CharSequence) "                 hi          !A             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                a                  ", " ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                a                  " + "'", str2, "                a                  ");
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aahi#####", "                                          ", 33, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                          " + "'", str4, "                                          ");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA", "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", " s ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA" + "'", str3, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA");
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###################################", "       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################" + "'", str2, "###################################");
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            ", (int) ' ', "              Hi!               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            " + "'", str3, "                                            ");
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aahi", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi" + "'", str3, "aahi");
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("##########################################A                                  ##########################################", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################A                                  ##########################################" + "'", str2, "##########################################A                                  ##########################################");
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("               a hi!        ...", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #ahI!AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi      #a");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aahi##########", "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa                                                                                      a  aahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str2, "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##        Hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##", "", "", "", "", "", "", "", "Hi!" });
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                                                                                                                                                                      aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                     ##############################################################A                                                                                       ", (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "     a4hi!     ", (java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ih", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa       A");
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A HI                                                                                                                                                                                             a hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444 ", 53);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", 4, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi" + "'", str3, " hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               A               ", 90, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#...", "a hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..." + "'", str2, "#...");
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4ihaa  a                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4", "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "###########################A4444444444444444444444444444444444444444444444444444  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##########                                            444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                            444444444444444444444444" + "'", str1, "##########                                            444444444444444444444444");
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##########                                                                             ##########", "                                                     ##########                                                                             ##########                                            ", "44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ", "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              " });
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                     ##############################################################A                                                                                       ", "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                     ##############################################################A                                                                                       " });
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444               A               444444", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444               A               444444" + "'", str2, "44444               A               444444");
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string" + "'", str1, "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string");
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4ihaa  a                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", "aaaaahiaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4" + "'", str2, "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ", "                                                                                                 hi!IHAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "#######a                                  ##########################################", (java.lang.CharSequence) "                               aaaaaaaaaaaaaaaaaaaaaaaa     ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#######a                                  ##########################################" + "'", charSequence2, "#######a                                  ##########################################");
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aahi##########", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...C;GNIRTS.4               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4IH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "CLASS [cCLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "              ", 903);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aahi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi!" + "'", str2, "aahi!");
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "              ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!", 312, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                         AAHI######!I                      AAHI!" + "'", str3, "...                                                         AAHI######!I                      AAHI!");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                         ######################################################################", "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         ######################################################################" + "'", str2, "                                         ######################################################################");
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH", "A HI!!IH                                                         ...", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH" });
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########");
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H", "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAHI!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ih" + "'", str1, "AAHI!ih");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a" + "'", str3, " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a");
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!##########444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "#...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                     !ihaa                                                     ", (java.lang.CharSequence) "hi##########");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                     !ihaa                                                     " + "'", charSequence2, "                                                     !ihaa                                                     ");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...#######A...#######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "s", (java.lang.CharSequence) "Ahi!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", (java.lang.CharSequence) "A hi!!ih                                                                                                 ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("class [Cclass [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Cclass [Ljava.lang.String;" + "'", str1, "class [Cclass [Ljava.lang.String;");
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaahiaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     h!                ", "               a hi!               ", (int) (short) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", strArray3, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "     h!                " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a", "##hi#aaaaaaaaaa                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a" + "'", str2, "a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a");
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                     aaaaaaaaaaaaaaaaaaaaaaaa     ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     aaaaaaaaaaaaaaaaaaaaaaaa     " + "'", str2, "                     aaaaaaaaaaaaaaaaaaaaaaaa     ");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                !ih                                                                              ", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih                                                                              " + "'", str2, "                !ih                                                                              ");
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", 638, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("              Hi!               ", "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "              Hi!               " });
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ", (java.lang.CharSequence) "##################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hhhhhhhhhhhhhhhhhhhhhhhh", "       A                                  a      a       A                                  ", "A              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "Ahi##########HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("##H", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##H" + "'", str3, "##H");
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." });
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "AAHIaaaaaaaaaaaaa#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aahi######", (java.lang.CharSequence) "       A                                          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aahi######" + "'", charSequence2, "aahi######");
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444AAHI444444444444444444444444", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444AAHI444444444444444444444444" });
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("A HI                                                                                                                                                                                             a hi!", "AAHI##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI##########" + "'", str2, "AHI##########");
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "a", 0);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "4");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aHi       ", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "aahi", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " });
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  i! ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  i! " });
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih");
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aih                                                                                                 ", "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aih                                                                                                 " + "'", str2, "aih                                                                                                 ");
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "aIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a  aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a  aahi4" + "'", str1, "a  aahi4");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa", "4ihaa  a                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaAahi#####aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aIH                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aIH                                                                                                 " + "'", str2, "aIH                                                                                                 ");
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aahia##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahia##########" + "'", str1, "Aahia##########");
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("AAHI######AHI##########AHI######", 78, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI######" + "'", str3, "...HI######");
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#######################################################################################################################", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################################################################                                                                                                                                   " + "'", str2, "#######################################################################################################################                                                                                                                                   ");
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a#hi!!ih################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a", "#", "hi", "!!", "ih", "################################################################################################" });
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ahi       ", "class [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Cclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...classclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ".", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (int) 'a', "AAHI4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("               hi!                ", "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4", "                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               hi!                " + "'", str3, "               hi!                ");
    }
}

