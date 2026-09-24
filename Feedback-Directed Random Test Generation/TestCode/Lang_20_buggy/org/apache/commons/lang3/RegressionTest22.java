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
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################", "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("....................................................................................#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "....................................................................................#######..." + "'", str1, "....................................................................................#######...");
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ", "            !ih                                                                                                ", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               " });
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########                                                              ", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "a hi!!ih", (java.lang.CharSequence) "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaa", (java.lang.CharSequence) "     #hi#!", 326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Aahia##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                               ", (java.lang.CharSequence) "                                                                                                                         AAHI!ih                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###aaaaaaaaaaaaaaAAHIaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###aaaaaaaaaaaaaaAAHIaaaaa..." });
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                             ###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444 ##        Hi!" + "'", str1, "4444444444 ##        Hi!");
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("              Hi!               ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("aahi##########", "aahi##########", 35);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4', (int) (byte) 100, (int) (short) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", strArray3, strArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa" + "'", str12, "!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                 ", "###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########", 968);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String[] strArray8 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "a");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       hi!", (java.lang.CharSequence[]) strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH", strArray10, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "     H!                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("   ", 201, 223);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AA######################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(charSequence0, (java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!IH", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################.." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################.." + "'", str6, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...     AAHI######!IH                                      ...", "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...     AAHI######!IH                                      ..." + "'", str2, "...     AAHI######!IH                                      ...");
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAHI", 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444444444444" + "'", str3, "hi!4444444444444444");
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aAHI######aaaaaaaaaaaaaaAAHIaaaa", "       A                                  a      a       A                                  ", (int) (short) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aAHI######aaaaaaaaaaaaaaAAHIaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aAHI######aaaaaaaaaaaaaaAAHIaaaa" });
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                        ", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   ..." + "'", str2, "                                                   ...");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  " + "'", str1, "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "aahi##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ", "44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HAAHI######!IHAAHI######!IAAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HAAHI######!IHAAHI######!IAAHI!" + "'", str1, "HAAHI######!IHAAHI######!IAAHI!");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                      a    ", (java.lang.CharSequence) "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 874 + "'", int2 == 874);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                 a  aahi4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi4" + "'", str2, "hi4");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                                                                                                                                                                                  ###############a################                                                                                                                                                                                                                                                                                                               ", (java.lang.CharSequence) "                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa#####################################################################", (java.lang.CharSequence) "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..", 876);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...                             ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             ##########" + "'", str1, "...                             ##########");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                   !iH        ##", "ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   !iH        ##" + "'", str2, "                                                                                   !iH        ##");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "s44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######################################################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########################################A                                  ##########################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("########## 444444444444444444444444", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#######################################################################" });
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "CLASS [LJAVA.LANG.STRING;", "", "", "", "", "", "", "...CLASS [C", "", "", "", "", "", "", "...CLASS [LJAVA.LANG.STRING;", "", "", "", "", "", "", "...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     " });
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", " ##        Hi!               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   ", 103, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   aaa" + "'", str3, "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   aaa");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 516 + "'", int14 == 516);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!", (java.lang.CharSequence) "  ", 249);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       a...#######a...#######hi!", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444AAHI444444444444444444444444", (java.lang.CharSequence) "###############aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) " hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahia##########");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                a                  ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                              ", strArray3, strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahia##########" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                              " + "'", str6, "                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aIH                                                                                                 ", 609);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aIH                                                                                                 " + "'", str2, "aIH                                                                                                 ");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...       aaaaaaaaaaaaaa...", "... [ljava.l...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444444444444444", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!...", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...##########", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!", (java.lang.CharSequence) "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ", 151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence) "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA                        " + "'", str2, "                       AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA                        ");
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4" + "'", str2, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##########    #hi!AAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########    #HI!AAAAAAAAAAAAAA" + "'", str1, "##########    #HI!AAAAAAAAAAAAAA");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahi##########", '4');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...class              #...class [Ljava.lang...", 661);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...class              #...class [Ljava.lang..." + "'", str2, "...class              #...class [Ljava.lang...");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi4", (java.lang.CharSequence) "4              hI!               44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "               A                ", 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaa44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaa44444               a               444444" + "'", str1, "aaaaaaaaaaaaa44444               a               444444");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HI!IHAA                         ", (java.lang.CharSequence) "AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "A HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ", "                                      ########## 444444444444444444444444                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################################################################################################################################################################################################################################################################################################################", "       hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahi#####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "################################################################################################################################################################################################################################################################################################################################" + "'", str4, "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahi4!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                               ", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                   ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                   " });
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ", 177);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               a                ", (java.lang.CharSequence) "                     hi!...", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########" + "'", str1, "44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########");
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###########################AAAHI!i############################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 104, "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa       #HI#!##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################AAAHI!i############################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "###########################AAAHI!i############################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "A HI!!IH                                                                                                                   AAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 a                                                  ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                   ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A hi!!ih                                                                                                                   AAHI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "4", "!" });
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 62, "                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              " + "'", str3, "                                                              ");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", 124);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!" + "'", str1, "###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           " + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           ");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI4", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;4a");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a hi!     ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI4" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "444444444444444444               A               444444", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "Ahi##########HI", (java.lang.CharSequence) "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("################################", "                                           ##########                                            ", "                                                     aahi!                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################" + "'", str3, "################################");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...#######A...#######", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#######A...#######" + "'", str2, "...#######A...#######");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", 312, "#######################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" + "'", str3, "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         4", "          Hi!          ", 35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 27, 928);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         4" });
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "...#######a...#######", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("####################aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####################aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!" + "'", str1, "AAHI!");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH      ...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 895 + "'", int2 == 895);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa     ", (java.lang.CharSequence) "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH", "4444444444", "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH" + "'", str3, "...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("          ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "444444");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 44, 24);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("     hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     hi!                " + "'", str1, "     hi!                ");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "I", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                                         hi!              AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IHAAHI######!IH                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#######...class [c#######...class [ljava.lang.string;#######", charSequence1, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                                                                              hi!", "                                                 aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 ", "i!IHAa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaa    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "    " });
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ", 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A" + "'", str3, "A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 892, 636);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih", "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih" + "'", str2, "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!                               !ih");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  ", "ahi        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA", "hI                                                                                                                                                     ahia a##########                                                                                                                                                                                                                                                                                                        ahia a##########                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        char[] charArray11 = new char[] { '4', '4', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!IHAA", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 a                                                  ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", charArray11);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               #######...A#######...                ", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##########################################                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "       iHA       iHA#a#      iHA       iHA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "##########################################                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "###aaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AIH                                                                                                 ", "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 219, 319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 219 out of bounds for length 98");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.lang.String[] strArray4 = new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " };
        java.lang.String[] strArray9 = new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " };
        java.lang.String[][] strArray10 = new java.lang.String[][] { strArray4, strArray9 };
        java.lang.String[] strArray15 = new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " };
        java.lang.String[] strArray20 = new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " };
        java.lang.String[][] strArray21 = new java.lang.String[][] { strArray15, strArray20 };
        java.lang.String[][][] strArray22 = new java.lang.String[][][] { strArray10, strArray21 };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(strArray22);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "  ... " });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "class [L4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("####aahia##########aahia##########aahia#####", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ", 269);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "     h!               ", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", "                                                                                                                                                                           AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi" + "'", str3, "AAhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("              Hi!               ", "...class              #...class [Ljava.lang...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              Hi!               " + "'", str2, "              Hi!               ");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 326, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 304 + "'", int2 == 304);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str1, "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!        ...", (java.lang.CharSequence) "!ih                                !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#######################################################################################################################                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#####################################################ahi###############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################ahi###############################################################" + "'", str1, "#####################################################ahi###############################################################");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("CLASS [cCLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [cCLASS [lJAVA.LANG.sTRING;" + "'", str1, "CLASS [cCLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  i! ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                              aAHI#####                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  i! " + "'", str2, "  i! ");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAHIAAAAAAAAAAAAA#####################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("..                                                 a  aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4ihaa  a                                                 .." + "'", str1, "4ihaa  a                                                 ..");
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "              Hi!               ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                a           ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4ihaa  a                                                 ..", "...##aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4ihaa  a                                                 .." + "'", str3, "4ihaa  a                                                 ..");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                    hi!                ", "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    hi!                " + "'", str2, "                                    hi!                ");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########" + "'", charSequence2, "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4A4A4A4A4A4A4A4A4A4A4A4A4A4A4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " ", "##", "        ", "H", "i", "!", "               " });
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a  aahi4", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a", "", "aahi", "" });
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" hi!        ...    a               ", "               #######...A#######...                ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               a hi!               ", "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("aahi!", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "#...");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", strArray7, strArray11);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("#############################################################", strArray3, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " hi!        ...    a               " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "               a hi!               " });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str14, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "#############################################################" + "'", str15, "#############################################################");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "AA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "...##aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", (java.lang.CharSequence) "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                !ih                                                                              ", "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih                                                                              " + "'", str2, "                !ih                                                                              ");
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ahi#ahi#ahi#ahi#aahi", "", "########## 444444444444444444444444", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ahi#ahi#ahi#ahi#aahi" + "'", str4, "ahi#ahi#ahi#ahi#aahi");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("               ...    ...A...    ...                ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ahi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!..." + "'", str1, "ahi!...");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##hi#444444444", "  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi#444444444" + "'", str2, "##hi#444444444");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HHHHHHH...", (java.lang.CharSequence) " ########## 444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "##########################################################################################################################hi!...##########################################################################################################################", "H  HH! 4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 892, 9);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                     aahi!                                                     ", (java.lang.CharSequence) "aahi##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aIH", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aIH" + "'", str2, "aIH");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("A               #               A               #               A               #               A               #               A               #               A               #               A               #               A             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a               #               a               #               a               #               a               #               a               #               a               #               a               #               a             " + "'", str1, "a               #               a               #               a               #               a               #               a               #               a               #               a               #               a             ");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "!ih                                !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...                             ##########", "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               " + "'", str2, "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               ");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                  ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 hi!IHAA", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                                  ###############a################                                                                                                                                                                                                                                                                                                               ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A HI!", "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaa44444               a               444444", (-1), "                                                 aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaa44444               a               444444" + "'", str3, "aaaaaaaaaaaaa44444               a               444444");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) " aHi", 90, 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aahi######!ih                                                                                                                                                                                                                                                                       A HI!        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 761, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                                                                                             Hi!                                                                                                                                                               ", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", 94, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              " + "'", str3, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", (java.lang.CharSequence) "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444", (java.lang.CharSequence) "class [L4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               A HI!               ", 792, 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("          ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach(".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", strArray3, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A hi!!ih                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                     hi!...", strArray6, strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", str7, ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "A hi!!ih                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "A hi!!ih" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                     hi!..." + "'", str12, "                     hi!...");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aa4!", "                                                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("       ...", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ...                            " + "'", str2, "       ...                            ");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aahiaah                 hi          !aahiaah", "A HI!!IH                                                                                                                   AAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahiaah                 hi          !aahiaah" + "'", str2, "aahiaah                 hi          !aahiaah");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaa                                                                                                 hi!IHAA", "AAHI4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", (java.lang.CharSequence) "hi!!ih A", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) ".class [c#######...class [ljava.lang.string;#######", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" ", 176, "hi4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi4                                                                                              hi4                                                                           " + "'", str3, " hi4                                                                                              hi4                                                                           ");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) " A 444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I", "####### hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("A               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", "44444               A               444444", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" });
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAHI", "Hi!", 969);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                              ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "AA", "I" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444IH##########ih" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444IH##########ih");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "                !ih               ", 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...", (java.lang.CharSequence[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("     H!                     ", strArray3, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "     H!                     " + "'", str13, "     H!                     ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "H" });
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                     ##############################################################A                                                             ...", 64, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     ##############################################################A                                                             ..." + "'", str3, "                                                     ##############################################################A                                                             ...");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...AAAAAAA", "H##########################################A##########################################i##########################################A##########################################!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...AAAAAAA" });
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", "###444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AHi############", "aahiaahia!!", (-1));
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                     AAHI!                                                     ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AHi############" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i############" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "AHi############" });
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a hi!        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!        ..." + "'", str1, "a hi!        ...");
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class [L", "                                                                                            a  aahi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class [L" });
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "a hiaahia##########aahia########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "a hi!", (java.lang.CharSequence) "                                                                                              ", 304);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) " Hi!          ", (java.lang.CharSequence) "                                                     ##############################################################A                                                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "A hi");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "           ahi                    ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "          aaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("######################################################444444444444444444444444", 58, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################444444444444444444444444" + "'", str3, "######################################################444444444444444444444444");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa", "...C;GNIRTS.aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########...", "####################                a           ####################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#######a                                  ##########################################", "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######a                                  ##########################################" + "'", str2, "#######a                                  ##########################################");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                   ...", 757, 103);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                     hi!...", 310);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aAHI######aaaaaaaaaaaaaaAAHIaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI######aaaaaaaaaaaaaaAAHIaaaa" + "'", str1, "aAHI######aaaaaaaaaaaaaaAAHIaaaa");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AHI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AHI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ", 96);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str4, "hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("A HI!     ", "...hhhhhhhhhhhhhhhhhhhhh.......", "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                          ", (java.lang.CharSequence) "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                              ", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I", 157);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...... [LJAVA.L...", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("AAHI!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ih" + "'", str1, "AAHI!ih");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       ");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#######...A#######...", 903);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######...A#######...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "#######...A#######...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AA######################################################################################################", 234, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS CLASS [LJAVA.LANG.STRING;#######...CAA######################################################################################################" + "'", str3, "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS CLASS [LJAVA.LANG.STRING;#######...CAA######################################################################################################");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("          aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          aaaaa" + "'", str1, "          aaaaa");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", 177);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###########################A4444444444444444444444444444444444444444444444444444  ##########################################", (java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a", 915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######" + "'", str2, "#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######");
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi!ih                                                                 aahi!ih                                                                 aahi!ih                                                                 aahi!ih" });
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "H  HH! 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "       A                                  a...", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                                                                                                                                                                           Hi!", "                                                                                   !iH        ##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[ljava.lang.string;...class[c...class[ljava.lang.string;...class" + "'", str1, "class[ljava.lang.string;...class[c...class[ljava.lang.string;...class");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##hi#aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.CharSequence[] charSequenceArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               a                ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##hi#aaaaaaaaaa    ", 56, "...               4.STRING;C...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##hi#aaaaaaaaaa    ...               4.STRING;C......   " + "'", str3, "##hi#aaaaaaaaaa    ...               4.STRING;C......   ");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###AAAAAAAAAAAahi#######AAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAahi#######AAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAahi#######AAAAAAAAAAA");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                a           ", 18, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                a           " + "'", str3, "                a           ");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aahi", "444444444444444444444444444444444444444444444444444444444444444444444444444444", 111);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aahi" });
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               a hi!        ...    ", "aaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aa4!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               a hi!        ...    " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a hiaahia##########aahia########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 928);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "A HI                                                                                                                                                                                             a hi!", (java.lang.CharSequence) "a#hi!!ih################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################." + "'", str1, "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a##########", (java.lang.CharSequence) "!IHAA", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IH", 0, "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH" + "'", str3, "IH");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!IH", "hhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!IH" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!IH");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!IHAa", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!IHAa" });
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH", (java.lang.CharSequence) "                                  A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "          A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", "IH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.4                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("     H!                     ", "A4CLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     H!                     " + "'", str2, "     H!                     ");
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########                        ", "...C;GNIRTS.4               ...", (int) (short) 10);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                          hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 56, 969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########                        " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "##########                        " + "'", str7, "##########                        ");
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4IHAA", "HAAHI######!IHAAHI######!IAAHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                     aaaaaaaaaaaaaaaaaaaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     AAAAAAAAAAAAAAAAAAAAAAAA     " + "'", str1, "                     AAAAAAAAAAAAAAAAAAAAAAAA     ");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 HI!ihaa", "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", "                                                 a                                                  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "##########                                ", (java.lang.CharSequence) "A HI!!IH                                                         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#####################...", "                                           ##########                                            ###", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################..." + "'", str3, "#####################...");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444########## 44444444444444444444444444444444444##########", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#..                                                 a  aahi4", (java.lang.CharSequence) "                                          a       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##########    #HI!AAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########    #HI!AAAAAAAAAAAAAA" + "'", str1, "##########    #HI!AAAAAAAAAAAAAA");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " aHi", (java.lang.CharSequence) "... [ljava.l...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                       ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "LASS[LJAVA.LANG.STRING;HICLASS[LJAVA.LANG.STRING;CLASS[CCLASS[LJAVA.LANG.STRING;CLASS[LJAVA.LANG.STRING;HI", (java.lang.CharSequence) " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", "!ihaaaaaaaaaaaaaaaaaaaaaaaa                                  ", 874);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " });
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4hi!444hi!4", 64, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HHHHHHH...", "######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHH..." + "'", str2, "HHHHHHH...");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "...#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String[] strArray7 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "a");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "##########", (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                      444444444444444444444444 ##########                                      ", 83, 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAHIaaaaaaaaaaaaa###                                      444444444444444444444444 ##########                                      ###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "AAHIaaaaaaaaaaaaa###                                      444444444444444444444444 ##########                                      ###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                         AAHI!ih                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#####################...", " Hi!          ", "                                                aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH", 30, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI######!IH");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(".class[c#######...class[ljava.lang.string;#######", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".class[c#######...class[ljava.lang.string;#######" + "'", str2, ".class[c#######...class[ljava.lang.string;#######");
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4", (java.lang.CharSequence) "aAHI######aaaaaaaaaaaaaaAAHIaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi", (java.lang.CharSequence) "44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aahi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "A hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#a#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###aaaaaaaaaaaaaaAAHIaaaaa...", (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "               A                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##########################################A                                  ##########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################A                                  ##########################################" + "'", str1, "##########################################A                                  ##########################################");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                      hi!ihaa                      ##########                                            444444444444444444444444                      hi!ihaa                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 180 + "'", int1 == 180);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "##########                                                                             ##########", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#################################################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "##########                                            444444444444444444444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################################################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################" + "'", str3, "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#################################################################################################" + "'", str4, "#################################################################################################");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ", "                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaaaa ");
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "######################################################################", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "           ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" ########## 444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "##########", " ", "444444444444444444444444" });
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) " aH", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("class [Cclass [Ljava.lang.String;", "...HI######", 76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Cclass [Ljava", "lang", "String;" });
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih                                !ih                     aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                                !IH                     AAAAAAAAA" + "'", str1, "!IH                                !IH                     AAAAAAAAA");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "#################################################################aaaaaaaaaaaa", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               a                ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHIaaaaaaaaaaaaa###                                      444444444444444444444444 ##########                                      ###4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444", "AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "class[ljava.lang.string;...class[c...class[ljava.lang.string;...class", (java.lang.CharSequence) "aahi######!ihaahi######!ihaahi######!ihaahi######!ihaaahiaahi######!ihaahi######!ihaahi######!ihaahi######!iha", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "                                                                                                hi!            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", "AHi       AHi      #a#AHi       AHi       AHi       AHi      #a#AHi       AHi       AHi       AHi   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[", 234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;4", (java.lang.CharSequence) "                      hi!ihaa                       ", 968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", (java.lang.CharSequence) "##########################################A", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    ", "ahi##########", 24);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "          Hi!           ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########", "aahi4", 31);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa", strArray5, strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny(charSequence0, (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    " + "'", str7, "    ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaa" + "'", str12, "aaaa");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444               A               444444", (-1), 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                !ih                                !ih                     aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "                                                 a                                                  ", 4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A                                  ", (java.lang.CharSequence[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AAHI", (java.lang.CharSequence[]) strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1, strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "4", "A", "4", "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 527, 90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                 a                                                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 310, 2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING", "                                            #                                                                             #                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING" + "'", str2, "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", 250, "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa" + "'", str3, "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "CLASS[cCLASS[lJAVA.LANG.sTRING;", (java.lang.CharSequence) "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi4", "H  HH! 4", 14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi" });
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!" + "'", str1, "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (java.lang.CharSequence) "aaaaaa##hi hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                               #...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "...            a4!...                                                                                                                                                                            ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                         ", "                !ih               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                         " });
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "I", (java.lang.CharSequence) "                         A                                  A         aH                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                !ih                ", " ##        Hi!               ", (int) (short) 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 99, 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                       ", "HI4                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...               4.string;c...", (java.lang.CharSequence) "4IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 31, "A.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                               A HI!        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                  ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 a  aahi4", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        hI!", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               a hi!               ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "AAHI######AHI##########AHI######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "        !        !        !        !        !        !        !        !        !  ", 56);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                       ", "                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ", " ########## 444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ", 189, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        " + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                        ");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!IHAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAA...", (java.lang.CharSequence) "#######..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "ih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih Aih A", (java.lang.CharSequence) "###444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "A", 94);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace(" ##        hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "## hi!" + "'", str1, "## hi!");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "...##########", (java.lang.CharSequence) "## hi!", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", (java.lang.CharSequence) "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##        Hi!" + "'", str1, "##        Hi!");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "############################################ a ############################################ !ihaa !ihaa !ihaa !ihaa !ihaa !ihaa", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              " + "'", str1, "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", "AAHI4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "AAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Aahi#####", "                                                                                                                                                                                                                                               A HI!        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aahia##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 44, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("                                          a       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            ##########                                                                             ##########", (java.lang.CharSequence) "###aaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                a           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("CLASS [cCLASS [lJAVA.LANG.sTRING;", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [cCLASS [lJAVA.LANG.sTRING;" + "'", str2, "CLASS [cCLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AIH                                                                                                 ", (java.lang.CharSequence) "##################################AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH###################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                ", "hI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", 83, 219);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 83 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########AAAAAAAAAAAAAAAAAAAAAAAAA ########## ##########                " });
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hI4                                                                                                 ", "!4a", "               A               4               A               4               A     a hi!!ih  4               A               4               A               4               A ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 895, 58);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#...", "AAHIaaaaaaaaaaaaa######################################################################", "                                #               a                #                                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "Ahi##########HI", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "s");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "##########################################A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######" + "'", str3, "aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "        !        !        !        !        !        !        !        !        !  ", (int) (byte) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "            !ih                                                                                                ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "A", "aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa", "A", "aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                a                  ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4!", (java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 761, 7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi##########", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;", "a hi!!ih", "aA######################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;");
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "Class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", (java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444", "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444" });
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class" });
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444 " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 767 + "'", int1 == 767);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!4a", 690, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!##########444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 246);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!##########444444444444444444444444" });
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                ", 104, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", "aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!" });
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("lJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "4444444444444444444444444444444444444444444444444444444444444444444444444444 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aahia##########aahia####");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahia##########aahia####" });
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      hi!ihaa                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  aahi4   ", "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "hi4", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "aahi##########");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aahi##########" + "'", charSequence2, "aahi##########");
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                         ...", (java.lang.CharSequence) "a4a", 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", 0, "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                  ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#########", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            " + "'", str1, "                                            ");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                     ##############################################################A                                                                                       ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     ##############################################################A                                                                                       " + "'", str3, "                                                     ##############################################################A                                                                                       ");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!!ih A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                !ih                                !ih                     aaaaaaaaa", "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", "    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A 4444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "A 4444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aHi       ", "       A                                          ", 90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                          aHi       " });
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                .                                                                                                .                                                                                                .                                                                                                .            #######A##################################a######a#######A##################################                                                                                                .                                                                                                .                                                                                                .                                                                                                .            ", (java.lang.CharSequence) "                                                 a                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A hi!!ih", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) ".class [c#######...class [ljava.lang.string;#######", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", "                                                                                                                   a hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I" + "'", str2, "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I");
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih !ih", "444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI444444444444444444444444444444444444444444444444AAHI44444", "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahia##########");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                a                  ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                              ", strArray3, strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "              Hi!               ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                                                        ##########                                            ###                                                                                                              ", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahia##########" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                              " + "'", str6, "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        " + "'", str2, "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "AAHI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "          ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                                 a                                                  ", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "", (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                 a                                                  " + "'", str8, "                                                 a                                                  ");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(".class[c#######...class[ljava.lang.string;#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######;gnirts.gnal.avajl[ssalc...#######c[ssalc." + "'", str1, "#######;gnirts.gnal.avajl[ssalc...#######c[ssalc.");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              " + "'", str2, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444               A               444444", "AAHIaaaaaaaaaaaaa#####################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi!IHAA", 111);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    Hi!IHAA                                                    " + "'", str2, "                                                    Hi!IHAA                                                    ");
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                   a hi", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                   a hi" + "'", str3, "                                                                                                                   a hi");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 523, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          " + "'", str3, "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" });
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310 + "'", int1 == 310);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                               #...", "AHi       AHi      #a#AHi       AHi       ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444444444444444444444444444444", 792, 234);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       ...                            ", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hhhhhh", "!IH", 99);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("####################################################################################################################################################################################################################################################################################################                                            #                                                                             #                                                     #####################################################################################################################################################################################################################################################################################################", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hhhhhh" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "##########", "##########", "AAAAAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str8, "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "##################", (java.lang.CharSequence) "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", 524);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", (java.lang.CharSequence) "a      a       A                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAHI", "Hi!", 969);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AA", "I" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "AA", "I" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "               ", (java.lang.CharSequence) "AHI##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444 ##        Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        char[] charArray9 = new char[] {};
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A                                  ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                 a  aahi4", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi######ahi##########ahi##########ahi##########ahi", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi######!ih                                                                 ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAaahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI                                                                                                                                                     ahia a##########                                                                                                                                                                                                                                                                                                        ahia a##########                                                                                                                                                                                                                                                                                          ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 99, 157);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 24, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str3, "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!", "          Hi!          ...44444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!" + "'", str2, "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                     class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "H##########################################A##########################################i##########################################A##########################################!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               #######...A#######...                ", "A               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               #######...A#######...                " });
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                                  ", "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  " + "'", str3, "                                                                  ");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##        4i!" + "'", str2, "##        4i!");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                !ih                                                                              ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "               A                ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IH", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                ", "!", "ih", "                                                                              " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "!", "ih", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "4  hi4                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaa                                                                                                 hi!IHAA", " hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "a#hi!!ih##...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 94, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str3, "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "AAAAAAAAAAAAAAAAAAAAAAAA ########## #########");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#######...CLASS[C#######...CLASS[LJAVA.LANG.STRING;#######", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class", 68, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaa                                                                                                 hi!IHAA", (java.lang.CharSequence) "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ############################################               A               ############################################                 ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaa                                                                                                 hi!IHAA" + "'", charSequence2, "aaaaaaaaaaaaaa                                                                                                 hi!IHAA");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    aaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", (java.lang.CharSequence) "#4hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" + "'", charSequence2, ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "#####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                          h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "AAHIaaaaaaaaaaaaa#####################################################################4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                hi!        ...", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 29");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                          h" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa", (java.lang.CharSequence) "hi!4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahi######!ih                                                                 aahi######!ih" + "'", str1, "Aahi######!ih                                                                 aahi######!ih");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA", (java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                !ih                                !ih", (java.lang.CharSequence) " HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "                         ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class", (java.lang.CharSequence) " #..                                                 a  aahi4 #..                                                 a  aahi4", 193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#################################################################aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################aaaaaaaaaaaa" + "'", str1, "#################################################################aaaaaaaaaaaa");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########                        ", 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                             a hi                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                             a hi                                                                                                                                                              " + "'", str1, "                                                                                                                                                             a hi                                                                                                                                                              ");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        char[] charArray10 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "               A HI!               ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############################               a hi!               ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ...", "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING", 47);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 31, 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "a hi!     ##########                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HI!IHAA", (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaaaaaaaaaaaaaaaa    aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                    A              ", "", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                    A              " });
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!", "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!" });
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "CLASS[cCLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "AAHI##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3, annotatedElementArray4 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray5);
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertArrayEquals(annotatedElementArray1, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertArrayEquals(annotatedElementArray3, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertArrayEquals(annotatedElementArray4, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray5);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                              hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################.." });
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" });
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("aahia!", "                                                                         a hi!               ");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A HI!     ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin" + "'", str12, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strina#hi!!ih################################################################################################class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [LjavaAAHI!ihclass [Ljava.lang.Strin");
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########################################A                                  ##########################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################A                                  ##########################################" + "'", str2, "##########################################A                                  ##########################################");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      hi!ihaa                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                      hi!ihaa                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4IH" + "'", str1, "4IH");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                         ######################################################################", 167);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 HI!ihaa", "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 HI!ihaa" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("H                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "                                                                 ", "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "I", "                      ", "AAHI", "!" });
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                    ", (java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A 4444444444444444444444444444444444444444444444444444444444444444444444444444", "##########################################A ##########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

