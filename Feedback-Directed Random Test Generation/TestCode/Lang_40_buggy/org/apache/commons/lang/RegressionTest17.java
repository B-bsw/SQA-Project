package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444" + "'", str1, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        boolean boolean6 = org.apache.commons.lang.StringUtils.startsWithAny("#########################", strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByCharacterType("###");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray10, "hi!      hi!                     ");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#                                                            HI!4HI!", strArray7, strArray10);
        boolean boolean14 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "###" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "###" + "'", str12, "###");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#                                                            HI!4HI!" + "'", str13, "#                                                            HI!4HI!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "444444444444hi444444444444hi444Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih444444444444hi444444444444hi4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                          444...                                                                                                                                                                                                                                                                                                                                           ", "444444444444444444444444444444HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...########...", "                                Hi!                                                              ", 663);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...########..." });
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "i!", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove(".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444#...####...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("i!hi!hi!hi!hi!hi!hi!hi!hihi!", "444444444444444                        ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ', 892, 219);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!hi!hi!hi!hi!hi!hi!hihi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("#                                                            HI!4HI!", "44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                     444...####...44444                      ", (int) (byte) 10, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     444...####...44444                      " + "'", str3, "                     444...####...44444                      ");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4" + "'", str1, "i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...####...");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...####..." });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####..." + "'", str3, "...####...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...####..." + "'", str4, "...####...");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi" + "'", str1, "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                                                                         ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("I!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "4444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                               !ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("...################################...################################...################################...################################......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ", "444...####...444444", 153);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      ", "      ", "     iHiHiHiHiHiHiHi", "      ", "      ", "      " });
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("HI!                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                         " + "'", str1, "HI!                                                                         ");
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI", "44444444444hihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444hihihihihihihihihihi" + "'", str2, "444444hihihihihihihihihihi");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!", "#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", 679);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi", 162, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi" + "'", str3, "####################################################444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "hi!       ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444444##44444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str5, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                 44444444444444444444444444444444444", "          ", (int) ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray5, "4########4444444444444444444444444444444444444444444444444444444...");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, '#');
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("", strArray5);
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "44444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#################44444444444444444444444444444444444" + "'", str9, "#################44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray4);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsAny("                 44444444444444444444444444444444444", charArray4);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("                                                                                                                                                                                                                                              44444444444444444444                ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("", 886, "444444444#...####...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444" + "'", str3, "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("########################...##################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################...##################################..." + "'", str1, "########################...##################################...");
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", "HI!                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray4);
        int int7 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str9, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444", "##", "44444444444444444444444444444444444444" });
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                         4444444444444444444444444444444444", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   " + "'", str2, "                                                   ");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("4444444########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444########" + "'", str1, "4444444########");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("...####...                                                                               ", "                     444...####...44444                      #########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                               " + "'", str2, "...####...                                                                               ");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                 hi!                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("...####...                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!      hi!#####", "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("         iHiHiHiHiHiHiH                         hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                            ", "hi!", 23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                            " });
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "4444444444##########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" + "'", str2, "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("...", "444444444444444444444444444                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("########", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("H                                 !", "444444444444HI444444444444HI444IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH444444444444HI444444444444HI4444", 57);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "                                 ", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 489 + "'", int5 == 489);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "##########                                 ......hI44444444444444444444444444444444444hI4444444444444444444...hi!                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4hi!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!" + "'", str3, "4hi!");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        char[] charArray8 = new char[] { 'a', '#', '#', '#', '4', '4' };
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444...", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("4##########                 4444444Hi!      hi!                     44444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444444444444444444444444444444Hi!", "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, ' ', 0, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!ihiiiiiiiiiiiiiiiii", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444444" + "'", str6, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                H!IH!IH!Ih                               ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "", 28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                H!IH!IH!Ih                               " + "'", str4, "                                H!IH!IH!Ih                               ");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("444444444444hi!4444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444hi!4444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444" + "'", str2, "444444444444hi!4444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", (int) (short) -1);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 603, "444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444                        44444444444444444444                        44444444444444444444                        444444444444444444          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444444444444444444                        44444444444444444444                        44444444444444444444                        4444444444444444444" + "'", str3, "444444444444444                        44444444444444444444                        44444444444444444444                        444444444444444444          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444444444444444444                        44444444444444444444                        44444444444444444444                        4444444444444444444");
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                       444444444444444444444444444                                   iHiHiHiHiHiHiHi", "!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "                                         444444444444hi                                          ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444444444#", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", 498);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "444444444#...####...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 48 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########" });
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", "#################################################################################################44444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("444444444aaaaaaaaaaaaaaaaaaaaa", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "444444444aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                         ", 26, 869);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                               " + "'", str3, "                                                                                                                               ");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("#################################", "...###############################");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("...####...     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...####...", "     " });
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!             ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih                                                            " + "'", str1, "!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih                                                            ");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 58);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("44444444444444444444444444444444!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444!IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH44444444444                                                                                         !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH44444444444                                                                " + "'", str1, "44444444444444444444444444444444!IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH44444444444                                                                                         !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH      !IH44444444444                                                                ");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!             ", 295);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("#########################################", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################" + "'", str3, "#########################################");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444                                   iHiHiHiHiHiHiHi", "44444444444444444444444444444444444444##4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444                                   iHiHiHiHiHiHiHi" });
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("Hi!hi!hi!h", "4444444444##########44444444444444444444444444444444444444", (int) (byte) 0);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, "                                                                                                    ");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray8);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, "Hi!", (int) (byte) 100, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("4444444444##########44444444444444444444444444444444444444##########", strArray4, strArray8);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str19 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!hi!hi!h" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########" + "'", str17, "4444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444Hi", "                        4444444444444...                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", "A", "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str3, "                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("44444444444444", "####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        int int1 = org.apache.commons.lang.StringUtils.length("..............................................................................................................................................................................................................................................................................................................................................................#                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 398 + "'", int1 == 398);
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   " });
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", 64);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 " });
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI" + "'", str3, "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI", "#################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                         ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 108, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...", 183);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA..." + "'", str2, "                                                                                      AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!h");
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("!ihih!ih!ih!ih!ih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!ihih!ih!ih!ih!ih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str10, "!ihih!ih!ih!ih!ih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########", 606, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########" + "'", str3, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("444444444444444444444444444444HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("#######44444444444444444444444444444444444444##########44444444", "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             ", "                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########44444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###########44444444444444444444444444444..." });
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("#################                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444##########4444444444444444444444444444444", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "4444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("...#...                                                                                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...#...                                                                                          " + "'", str4, "...#...                                                                                          ");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "################################...", 241);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                               #..............................................................................................................................................................................................................................................................................................................................................................", 892, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                      #..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                                                                      #..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase(" #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...4444444444444444444iH4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, " #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                 4444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 4444444444444444444444444444444444" + "'", str2, "                 4444444444444444444444444444444444");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str1, "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("               #                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "                                     ...########...                                      ", 63, 17);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "#################44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("4444444444##########44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("#########################", "#4#4#4#4#4#4...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("#################################################", 162, "###   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###  " + "'", str3, "####################################################   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###   ###  ");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih" + "'", str1, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                              HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("###########                                      ", "###############                 ", 735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444##########44444444444444444444444444444444444444##########" });
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH", "444444444444444444444444Hi!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                H!IH!IH!Ih                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H!IH!IH!Ih" });
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", "", 564);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         " });
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI", 375, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("4444##########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("#########", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", 181);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                           hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      " + "'", str2, "                                                                                           hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("...####...      ", 910, 921);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...      " + "'", str3, "...####...      ");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("", "44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444" + "'", str2, "44444444444444444");
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("...                            ...", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.split("444...####...44444", 'a');
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, '#');
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("4444444444##########44444444444444444444", strArray3, strArray6);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...                            ..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "444...####...44444" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444...####...44444" + "'", str8, "444...####...44444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444##########44444444444444444444" + "'", str9, "4444444444##########44444444444444444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...                            ..." + "'", str10, "...                            ...");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "##################4hi!##################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 82, 604);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str3, "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                        ...                                                                        ", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        ...                                                                        " + "'", str3, "                        ...                                                                        ");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("###      ", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###      " + "'", str2, "###      ");
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("#!ih4#4#4#4#4#4#4#4#4#", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", 223);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#!ih4#4#4#4#4#4#4#4#4#" });
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                              HHHHHHHHHHHHHHHH", "###   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              HHHHHHHHHHHHHHHH" + "'", str2, "                                                                              HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                          4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                          4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                          4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("", "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################" + "'", str1, "###################################");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "...########################...##################################...########################...####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("###############", 85, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################" + "'", str3, "#####################################################################################");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("..............................................................................................................................................................................................................................................................................................................................................................#                                               ", "#################                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..............................................................................................................................................................................................................................................................................................................................................................#                                               " + "'", str2, "..............................................................................................................................................................................................................................................................................................................................................................#                                               ");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("Hi!hi!hi!", "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("########################################################################################################################################################################################################", "4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################################################################################################" + "'", str2, "########################################################################################################################################################################################################");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                               !ih                 ", "4444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444", 82);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                               !ih                 " });
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("###############################################..", "                                     ##########                                       #################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hi!hi!hi", "hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "444444444444444                        44444444444444444444                        44444444444444444444                        444444444444444444          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444444444444444444                        44444444444444444444                        44444444444444444444                        4444444444444444444", " 44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                         444444444444hi                                          ", ' ', 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!", "###", (int) '#');
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!" });
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("......", "444444444#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......" + "'", str2, "......");
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444##########44444444444444444444444444444444444444##########", "                                #################################################################", (int) (short) 10);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444##########44444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444##########44444444444444444444444444444444444444##########" + "'", str6, "444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("...####...                                                                                          ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ...                                                                                          " + "'", str3, "...    ...                                                                                          ");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        int int1 = org.apache.commons.lang.StringUtils.length("44444444444HiHiH                        ...                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("...4444444444444444444iH44444444444444444444444444444444444iH......", 64, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444iH44444444444444444444444444444444444iH......" + "'", str3, "...4444444444444444444iH44444444444444444444444444444444444iH......");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################44444444444444444444444444444444444444" + "'", str1, "###########################################################44444444444444444444444444444444444444");
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("################################################################################################################################################################################################################################################################################################################################################################################## ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ", "                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa", "44444444444444444444444444444444444########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("   #################################################################", 583, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   #################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444   #################################################################444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "##########                                 ......hI44444444444444444444444444444444444hI4444444444444444444...hi!                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444Hi!", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("...####...                                                                                          ", charArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("#!ih4#4#4#4#4#4#4#4#4#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#!ih4#4#4#4#4#4#4#4#4#" + "'", str1, "#!ih4#4#4#4#4#4#4#4#4#");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                H!IH!IH!Ih                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("####################################################################################################", "         4                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("#444444444", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444", "hi!      hi!#####", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("###################################", ".................................................................................................", 498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("...   ...", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   ..." + "'", str2, "...   ...");
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("H                                 !", 85, "444444hihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444hihihihihihihihihihi444444hihihihihihihihihiH                                 !" + "'", str3, "444444hihihihihihihihihihi444444hihihihihihihihihiH                                 !");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("444444hihihihihihihihihihi", "444...####...444444", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                                 !", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                              HI!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("4444444444##########44444444444444444444444444444444444444##########", "                                               !ih                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("Hi!      hi!                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!", "hi!" });
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444444", "...          !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("444444444444444                        44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih444444444444ih444hi!      hi!", "                                         444444444444hi                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih444444444444ih444hi!      hi!" });
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                 H", "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ", 414, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("44444HI!", "#######44444444444444444444444444444444444444##########444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444HI!" + "'", str2, "44444HI!");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("###########                                      ", "...####...                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########                                      " + "'", str2, "###########                                      ");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "", "#4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str3, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("#################################################################################################44444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" });
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!" + "'", str1, "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI" + "'", str2, "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("...####...                             ...", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("...   ...", "#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("########################################################################################################################################################################################################################################################################################################################...", 'a', 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                                               #44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " 44444444444444444444444444444444444444 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("...####...      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("444444444444444444444444444444Hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444Hi!" + "'", str2, "444444444444444444444444444444Hi!");
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", 274, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("#######44444444444444444444444444444444444444##########444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i", 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######", "##########" });
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("!I", "Hi!      hi!                     ....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................444444444444hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                 ", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("              hi!      hi!             ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", "####### 44444444444444444444444444444444444444 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......##########################################  ######################################" + "'", str3, "......##########################################  ######################################");
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!iH", ' ', 583);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" });
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("##########...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########..." });
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("", 77, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444" });
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444..." });
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 61, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "###### 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H", 414, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H" + "'", str3, "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H");
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("...4444444444444444444iH4444444444", "hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("###########Hi!                                                                                                                                                                                                                                                                                                          ", "iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###########", "!                                                                                                                                                                                                                                                                                                          " });
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ..." + "'", str2, "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                 HI!                                                ", 193, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("#################################################################################################44444444444444444444444444444444444444444444444444444444444A", 315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################44444444444444444444444444444444444444444444444444444444444A" + "'", str2, "#################################################################################################44444444444444444444444444444444444444444444444444444444444A");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("HI!", "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################" + "'", str2, "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", "                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           i!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                               ", "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 892);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                               " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("44444444444hihihihihihihihihihi                                              ", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("I", 193);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("4", 76, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################4" + "'", str3, "###########################################################################4");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsNone("", charArray5);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("                 4444444444444444444444444444444444", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                        ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("4########4444444444444444444444444444444444444444444444444444444...", 375);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                          4########4444444444444444444444444444444444444444444444444444444...                                                                                                                                                          " + "'", str2, "                                                                                                                                                          4########4444444444444444444444444444444444444444444444444444444...                                                                                                                                                          ");
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                                4444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("#############", "4444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", strArray4);
        int int9 = org.apache.commons.lang.StringUtils.lastIndexOfAny("I", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                 !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ##############", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444Hi!4444444444444444444444444hi!4hi!4hi!", "", 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444Hi!4444444444444444444444444hi!4hi!4hi!" });
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 444444444444444444444444444444444", "#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!" });
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################" + "'", str1, "#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4444Hi!444444", "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("#########################################################################Hi!hi!44", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################################################################Hi!hi!44" });
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444hihihihihihihihihihi", "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444hihihihihihihihihihi" });
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("###########################################################44444444444444444444444444444444444444", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              ###########################################################44444444444444444444444444444444444444                                               " + "'", str2, "                                              ###########################################################44444444444444444444444444444444444444                                               ");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!4444444444444444444444444444444444444444444444444", "");
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!4444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("", "                        h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 85 + "'", int2 == 85);
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, 'a', 0, 85);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("44444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", "AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsNone("", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                Hi!                                                                 ", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("    ################################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                h!ih!ih!iH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", ' ', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.split("#444444444", "Hi!hi!hi!h");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach("Hi!                                ", strArray4, strArray9);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##########" + "'", str5, "##########");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "#444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!                                " + "'", str10, "Hi!                                ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "##########" + "'", str11, "##########");
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("#################################################", 0, 680);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################" + "'", str3, "#################################################");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                               ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("#################", "44444444444444444444444444444444###      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################" });
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("########################################", "                                                                              HHHHHHHHHHHHHHHH", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "########################################" });
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "444444444444444                        ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", 105);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!" + "'", str4, "hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                                                              ##############################################..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                              ", "##############################################.." });
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######", "444444444444444444444444hI!4444444444444444444444444", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "", 105);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" });
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4                                                                                                                       " + "'", str2, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4                                                                                                                       ");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        int int1 = org.apache.commons.lang.StringUtils.length("!ih444444444444                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("...####...                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             ...####..." + "'", str1, "...                             ...####...");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 408 + "'", int2 == 408);
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.containsAny("!I", charArray3);
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsOnly("!i", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                               hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                ", "                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                                             ", 274);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             " + "'", str2, "                                                             ");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444", "A", "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("   #################################################################", "4##########                 4444444Hi!      hi!                     44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                    ");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                              44444444444444444444                ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 138 + "'", int3 == 138);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("...#...                                                                                          ", 735);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#...                                                                                          " + "'", str2, "...#...                                                                                          ");
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!" + "'", str1, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("####################################44444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                                                                                                                  4444444444##########444444444444444444444", "444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                  4444444444##########444444444444444444444" + "'", str2, "                                                                                                                                                                  4444444444##########444444444444444444444");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("hi#                                                            HI!", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#                                                            HI!" + "'", str2, "hi#                                                            HI!");
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("####################################################44444444444444444444444444444444444", "                                     !I                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################44444444444444444444444444444444444" + "'", str2, "####################################################44444444444444444444444444444444444");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("i!hi!hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!hi!" });
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "...####...                                                                                          ");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 50);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEach("444444444444444444444444hI!4444444444444444444444444", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str8, "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444hI!4444444444444444444444444" + "'", str9, "444444444444444444444444hI!4444444444444444444444444");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I", 274);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I                                                                                        " + "'", str2, "                                                                                        44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I                                                                                        ");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("444444444", "4##########                 4444444Hi!      hi!                     44444444444444444444444444444444444", "#################################################################", 36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444" + "'", str4, "444444444");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("44444hi!", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 43);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444hi!" + "'", str5, "44444hi!");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                !ih", "                                Hi!                                                                 ", 680);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("###############", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int11 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray10);
        java.lang.String str15 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray10, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray17 = org.apache.commons.lang.StringUtils.stripAll(strArray10, "                 444444444444hi!");
        java.lang.String[] strArray21 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "                                                                                         4444444444444444444444444444444444");
        int int22 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                         4444444444444444444444444444444444", strArray21);
        java.lang.String str23 = org.apache.commons.lang.StringUtils.replaceEach("#", strArray17, strArray21);
        java.lang.String str27 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray21, '4', 910, 315);
        java.lang.String str28 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                        ...", strArray5, strArray21);
        java.lang.String str32 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray21, '4', 146, 105);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                !ih" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "#" + "'", str23, "#");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "                                        ..." + "'", str28, "                                        ...");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("......##########################################  ######################################", "########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                                    ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("!iH4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH4444444444########4444444444444444444444444444444444444444444444444444444.." + "'", str1, "!iH4444444444########4444444444444444444444444444444444444444444444444444444..");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("4444444444##########44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444                        ", "...####...44444", 64);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444                        " });
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!444444444444444444444444444444444444444444444444                h", 375, "HHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "4444444444##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                    ###################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                  ", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 399, 603);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 399 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("             HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######" + "'", str1, "...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("####################################################44444444444444444444444444444444444", "444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("!                                 h", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           !                                 h                            " + "'", str2, "                           !                                 h                            ");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                            ...########...                                                                                                                                                                                                                                                                                                                                              ", "###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                            ...########...                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                            ...########...                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("i!hi!hi!hi", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi" + "'", str2, "i!hi!hi!hi");
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray7);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray7);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("#########", charArray7);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("a4444444444########4444444444444444444444444444444444444444444444444444444...", 892, "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str3, "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                ", "                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                               Hi!hi!hi!h                                ", "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444", "444444hihihihihihihihihihi444444hihihihihihihihihiH                                 !");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("...#...                                                                                          ", 667);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                             ...#...                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                             ...#...                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("444444444444444444444444hi!", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444hi!" + "'", str2, "444444444444444444444444hi!");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("...########...", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...########..." + "'", str2, "...########...");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444", "44444444444hihihihihihihihihihi", ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444" + "'", str3, "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a', 548, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444Hi44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########4444444444444444444444", "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("           #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################" + "'", str2, "#############                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "a4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                        ...", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase(" #########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                 44444444444444444444444444444444444", "          ", (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 30, 548);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "44444444444444444444444444444444444" });
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "###############################################.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444" + "'", str1, "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "hi!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str5, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("########aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa########", "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444H", "                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("Hi!hi!hi!", "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!" + "'", str3, "Hi!hi!hi!");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                            ", "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            " + "'", str2, "                                                            ");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("444444444444444444444444444444444444444a...#########################################################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a', 77, 564);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 77 out of bounds for length 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("#############", '4', 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("#########################", "44444444444444444444444444 ##########", 151);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("...###############################################", "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###############################################" + "'", str2, "...###############################################");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("", "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", "                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("444444444444444444444444444444444444444a...####...", "################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "Hi!      444444444444444                        44444", "", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444" + "'", str4, "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "...                                                                                                                                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", '#');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        char[] charArray8 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("...####...                                                                                          ", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi" + "'", str2, "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("hi!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("#########################################", "4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", "                                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("", "...                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("4444444444444444444444444444444##########4444444444444444444444444444444", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "A", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444##########4444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444##########4444444444444444444444444444444");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444hi", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  444444444444hi" + "'", str2, "                                  444444444444hi");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray9);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray9);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", charArray9);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("###########################################################################################################################################################################################################################################################################################################################", charArray9);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!h                                                                                         ", charArray9);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                         4444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("H                                 !", "444444444444hi!                 444444444444hi!                 444444444444hi!                 44444444Hi                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("", "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("###########################################################44444444444444444444444444444444444444", '#');
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("...####...      ", '4', 295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HHH" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("    ################################################################################################", 52, 548);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################" + "'", str3, "################################################");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "              hi!      hi!             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("Hi!hi!44");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "Hi!                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hi!44" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!44" });
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("####################################################44444444444444444444444444444444444", 886);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################44444444444444444444444444444444444" + "'", str2, "####################################################44444444444444444444444444444444444");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi#                                                            HI!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########", 'a');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "44", 896, 818);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("              hi!      hi!             ", "", 7, 199);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       " + "'", str4, "       ");
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 6, "...                              ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str3, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                                 H", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaa", "                                        ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 975);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                              HI!", "444444444444444                        44444", "                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              HI!" + "'", str3, "                              HI!");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                                         ", "                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                               Hi!hi!hi!h                               ", "444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               Hi!hi!hi!h                               " + "'", str3, "                               Hi!hi!hi!h                               ");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("444444444444hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444", "hi" });
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("                                                                                         ", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("aaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("4hi!#444444444#444444444#444444444#4444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi!#444444444#444444444#444444444#4444..." + "'", str1, "4hi!#444444444#444444444#444444444#4444...");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("####################                             #################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "HHHHHHHHHHHHHHHH", 10);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...#################################################################################################", "I!4", "I!4", "I!4", "I!4", "I!4", "I!4", "I!4", "I!4", "I!4HI!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("4444444444##44444444444444444444444444444444444444", 64, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaa4444444444##44444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaa4444444444##44444444444444444444444444444444444444");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4H", "aIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                            !ih444444444444                                                                              ", "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                          4########4444444444444444444444444444444444444444444444444444444...                                                                                                                                                          ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                          4########4444444444444444444444444444444444444444444444444444444...                                                                                                                                                          " + "'", str2, "                                                                                                                                                          4########4444444444444444444444444444444444444444444444444444444...                                                                                                                                                          ");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("###################################");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a', 90, 37);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("44444444444hihihihihihihihihihi ...", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444hihihihihihihihihihi ..." + "'", str2, "44444444444hihihihihihihihihihi ...");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("...####...", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("...    ...                                                                                          ", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray8, "...4444444444444444444Ih44444444444444444444444444444444444Ih......");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "                                                                                         4444444444444444444444444444444444");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "444...####...44444");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("###########################################################################################################################################################################################################################################################################################################################", "                                                                                         ", (int) ' ');
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "hi!       ");
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.stripAll(strArray13);
        java.lang.String str15 = org.apache.commons.lang.StringUtils.replaceEach("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", strArray10, strArray14);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.replaceEach("444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi", strArray3, strArray10);
        java.lang.String str20 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                    ", 32, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "###########################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str15, "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi" + "'", str16, "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                                                                                               ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                               " + "'", str3, "                                                                                                                               ");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("###   ", 662, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", 11, 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...################################...################################...################################...################################......", "         4                                                                                                                                                                                    ", 115);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444H", 862);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                     Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("#########################################", "4444444444##########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################" + "'", str2, "#########################################");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("44444444444HiHiH                        ...                        ", 30, "I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444HiHiH                        ...                        " + "'", str3, "44444444444HiHiH                        ...                        ");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                             ########                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.startsWithAny("#################################################", strArray4);
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("hi!444444444444444444444444444444444444444444444444                ", strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "##################################");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "##########" + "'", str9, "##########");
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 183);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "########## 44444444444444444444444444444444444444 ########## 4444444444", 204);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("              hi!      hi!             ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              hi!      hi!             " + "'", str2, "              hi!      hi!             ");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", 548, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                ...", "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444", 193);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaa...", "444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                        444444444444444                        44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("4444Hi!444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444Hi!444444" + "'", str1, "4444Hi!444444");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                ", "                                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!4444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", "                     444...####...44444                      #########################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444aaaaaaaaaaaaaaaaaaaaa", "############################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI", "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI" + "'", str2, "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("    ################################################################################################", '4', 146);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "444444444444hi444444444444hi444Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih444444444444hi444444444444hi4444", 73);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I" });
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("####################                             #################################################################", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaa                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaa                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                 !", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444..." + "'", str2, "4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                                                                                                                                                                                                                                              44444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("###      #########", "Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###      #########" + "'", str2, "###      #########");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("4444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444" + "'", str1, "4444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("###############                 ", "                                 H", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", 115);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###############                 " + "'", str4, "###############                 ");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("44444444444444444444                ", "...                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("h!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!             ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "", "I", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                        ...                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444444444##########44444444444444444444444444444444444444##########", 263);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444##########44444444444444444444444444444444444444##########" + "'", str2, "444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("Hi!                                ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray6, "#                                                            HI!4HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("...                               !ih                               !ih                               !ih                               !ih...", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi", "!", "                                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        int int1 = org.apache.commons.lang.StringUtils.length("...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                          ", "   #################################################################", 886);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("                                                                ####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                ####################################44444444444444444444444444444444444444" + "'", str1, "                                                                ####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("i!hi!hi!########## 44444444444444444444444444444444444444 ########", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi! 44444444444444444444444444444444444444 " + "'", str2, "i!hi!hi! 44444444444444444444444444444444444444 ");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                                                                                                                                                                            ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("################################################################################################################################################################################################################################################################################################################################################################################## ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ", 142);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################## ########## 444444444                                                                                                                                                                                                                                                                                                                                                        " + "'", str2, "################################################################################################################################################################################################################################################################################################################################################################################## ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("         4                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ", "##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        char[] charArray10 = new char[] { 'a', '4', ' ' };
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("", charArray10);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("...####...                                                                                          ", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray10);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("Hi!      hi!                     44444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("444444444", charArray10);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4                                                                                                                       ", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ", "                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                   ");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("#!ih4#4#4#4#4#4#4#4#4#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("HI!HI!HI!", "hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "4444##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!" + "'", str3, "HI!HI!HI!");
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9, "########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                                                                    4444##########", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("###############################################...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################..." + "'", str3, "###############################################...");
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "4444444444444444444444444444444444444444444444444444444444444444Hi!", 57);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, ' ', 312, (int) (byte) 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", 'a', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }
}

